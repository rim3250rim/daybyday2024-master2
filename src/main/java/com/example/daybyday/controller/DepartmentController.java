package com.example.daybyday.controller;

import com.example.daybyday.dto.DepartmentDTO;
import com.example.daybyday.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller  // 주로 뷰탬플릿으로 데이터 전달할대 사용
/*@RestController*/ //JSON이나 XML같은 RESTful 웹 서비스 응답을 반환하는데 사용
@RequiredArgsConstructor

public class DepartmentController {
    private final DepartmentService departmentService;


// 직원정보 리스트 JSON형태로 출력하여 확익
    @GetMapping("/jsonlist")
    public List<DepartmentDTO> jsonlist(){
        return departmentService.findAll();
    }

    @RequestMapping(value = "/department.do", method = RequestMethod.GET)
    public String findAll(Model model) {
        List<DepartmentDTO> departmentDTOList = departmentService.findAll();
        model.addAttribute("listDepartment",departmentDTOList);
        return "/department/department";
    }


/*
    @GetMapping("/department.do")
    public String findAll(Model model) {
        List<DepartmentDTO> departmentDTOList = departmentService.findAll();
        model.addAttribute("listDepartment",departmentDTOList);
        return "/department/department";
    }
*/

}
