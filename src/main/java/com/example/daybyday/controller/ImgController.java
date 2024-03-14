package com.example.daybyday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ImgController {

    @GetMapping("/")
    public String index() {
        return "index"; // index.html을 렌더링합니다.
    }

    @GetMapping("/showImage")
    public ModelAndView showImage() {
        ModelAndView modelAndView = new ModelAndView("/imgpopup/imgpopup");
        // 이미지 경로를 모델에 추가합니다. 실제 경로에 따라 수정하세요.
        modelAndView.addObject("imagePath", "/img/imgtest.jpg");
        return modelAndView;
    }


}
