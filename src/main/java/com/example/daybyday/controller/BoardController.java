package com.example.daybyday.controller;

import com.example.daybyday.dto.BoardDTO;
import com.example.daybyday.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/boardinput.do")
    public String boardinputForm() {

        return "board/boardinput";
    }

    @PostMapping("/boardlist.do")
         public String boardinput(@ModelAttribute BoardDTO boardDTO){
         boardService.boardinput(boardDTO);
          return "redirect:/boardlist.do";
    }

    @GetMapping("/boardlist.do")
    public String findAll(Model model){
        List<BoardDTO> boardDTOList = boardService.findAll();
        model.addAttribute("listboarddata", boardDTOList);
        return "board/boardlist";
    }



}
