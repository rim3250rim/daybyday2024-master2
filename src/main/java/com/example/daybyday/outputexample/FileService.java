package com.example.daybyday.outputexample;

import org.springframework.stereotype.Service;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

@Service
public class FileService {

    public String readFileContent() {
        StringBuilder content = new StringBuilder();
        try {
            FileInputStream inputStream = new FileInputStream("src/mealmenu.txt");
            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                content.append(line).append('\n');
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return " 파일을 찾을 수 없다. ";
        }
        return content.toString();
    }
}