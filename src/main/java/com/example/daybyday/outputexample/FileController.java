package com.example.daybyday.outputexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class FileController {

        @Autowired
        private FileService fileService;

        @GetMapping("/menutxtfile.do")
        public String readFile() {
            return fileService.readFileContent();
        }

    }
