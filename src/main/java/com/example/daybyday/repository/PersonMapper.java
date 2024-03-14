package com.example.daybyday.repository;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PersonMapper {
    List<Map<String, Object>> listPersonHome();
}
