package com.example.daybyday.controller;

import com.example.daybyday.service.PersonService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
/*@RestController*/
/*@RequiredArgsConstructor*/
public class PersondownController {

    private final PersonService personService;

    public PersondownController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/excel/down")
    public void excelDown(HttpServletResponse response) throws IOException {
        List<Map<String,Object>> listPersonHome = personService.listPersonHome();

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Person Data");

        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("지역");
        headerRow.createCell(1).setCellValue("남성");
        headerRow.createCell(2).setCellValue("여성");

        // Populate data rows
        int rowNum = 1;
        for (Map<String, Object> person : listPersonHome) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(String.valueOf(person.get("address")));
            row.createCell(1).setCellValue(String.valueOf(person.get("manperson")));
            row.createCell(2).setCellValue(String.valueOf(person.get("womanperson")));
        }

        // Set response headers
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setHeader("Content-Disposition", "attachment; filename=person_data.xlsx");

        // Write the Excel file to the response stream
        workbook.write(response.getOutputStream());
        workbook.close();
    }

    @GetMapping("/person.do")
    public String showData(Model model) {
        List<Map<String,Object>> listPersonHome = personService.listPersonHome();
        model.addAttribute("listPersonHome", listPersonHome);
        return "person/personhome";
    }
}