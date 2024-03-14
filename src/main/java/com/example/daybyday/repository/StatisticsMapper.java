package com.example.daybyday.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Mapper
public interface StatisticsMapper {

     List<Map>listhouseAllRoom();

     List<Map> listhouseOneRoom();
     List<Map> listhouseTwoRoom();
     List<Map> listhouseThreeRoom();

}
