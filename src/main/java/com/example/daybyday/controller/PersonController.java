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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class PersonController {
/*    public final PersonService personService;

    @GetMapping("/person.do")
    public String listPersonHome(Model model) {
        List<Map<String, Object>> listPersonHome = personService.listPersonHome();
        model.addAttribute("listPersonHome", listPersonHome);
        return "person/personhome";
    }*/

}

