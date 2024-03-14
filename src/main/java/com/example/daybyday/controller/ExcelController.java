package com.example.daybyday.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class ExcelController {

    @GetMapping("/excel/download")
    public void exelDownLoad(HttpServletResponse response) throws IOException {
        Workbook wb = new XSSFWorkbook();
        // Workbook wb = new HSSFWorkbook(); 으로 해도 됨.
        Sheet sheet = wb.createSheet("첫번째 시트");
        Row row = null;
        Cell cell = null;
        int rowNum = 0;


        row = sheet.createRow(rowNum++);
        cell = row.createCell(0);
        cell.setCellValue("번호");
        cell = row.createCell(1);
        cell.setCellValue("이름");
        cell = row.createCell(2);
        cell.setCellValue("제목");

        for (int i=0; i<3; i++) {
            row = sheet.createRow(rowNum++);
            cell = row.createCell(0);
            cell.setCellValue(i);
            cell = row.createCell(1);
            cell.setCellValue(i+"_name");
            cell = row.createCell(2);
            cell.setCellValue(i+"_title");
        }

// 컨텐츠 타입과 파일명 지정
        response.setContentType("ms-vnd/excel");
//        response.setHeader("Content-Disposition", "attachment;filename=example.xls");
                response.setHeader("Content-Disposition", "attachment;filename=example.xlsx");

                // Excel File Output
                wb.write(response.getOutputStream());
                wb.close();
                }

}