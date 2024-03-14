package com.example.daybyday.controller;

import com.example.daybyday.service.StatisticsService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class StatisticsController {

private final StatisticsService statisticsService;


/*전체데이터 확인테스트용*/
@GetMapping("/testdata")
public List<Map> testdata(){

    return statisticsService.listhouesTwoRoom();
}


   /*전체 테이터리스트*/
    @RequestMapping(value = "/statistics.do", method = RequestMethod.GET)
    public ModelAndView statistics(@RequestParam Map map, ModelAndView mav){
        List<Map> listhouesAllRoom = statisticsService.listhouesAllRoom();
        mav.addObject("listhouseAllRoom",listhouesAllRoom);
        List<Map> listhouesOneRoom = statisticsService.listhouesOneRoom();
        mav.addObject("listhouseOneRoom",listhouesOneRoom);
        List<Map> listhouesTwoRoom = statisticsService.listhouesTwoRoom();
        mav.addObject("listhouseTwoRoom",listhouesTwoRoom);
        List<Map> listhouesThreeRoom = statisticsService.listhouesThreeRoom();
        mav.addObject("listhouseThreeRoom",listhouesThreeRoom);
        mav.setViewName("/statistics/statistics");
        return mav;
    }

    @RequestMapping(value = "/statisticstest.do", method = RequestMethod.GET)
    public ModelAndView statisticstest(@RequestParam Map map, ModelAndView mav){
        List<Map> listhouesAllRoom = statisticsService.listhouesAllRoom();
        mav.addObject("listhouseAllRoom",listhouesAllRoom);
        List<Map> listhouesOneRoom = statisticsService.listhouesOneRoom();
        mav.addObject("listhouseOneRoom",listhouesOneRoom);
        List<Map> listhouesTwoRoom = statisticsService.listhouesTwoRoom();
        mav.addObject("listhouseTwoRoom",listhouesTwoRoom);
        List<Map> listhouesThreeRoom = statisticsService.listhouesThreeRoom();
        mav.addObject("listhouseThreeRoom",listhouesThreeRoom);
        mav.setViewName("/statistics/statisticstest");
        return mav;
    }





}
