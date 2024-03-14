package com.example.daybyday.service;

import com.example.daybyday.repository.StatisticsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StatisticsServicelmp implements StatisticsService {

    private final StatisticsMapper statisticsMapper;

    @Override
    public List<Map> listhouesAllRoom() {
        return statisticsMapper.listhouseAllRoom();
    }

    @Override
    public List<Map> listhouesOneRoom() {
        return statisticsMapper.listhouseOneRoom();
    }

    @Override
    public List<Map> listhouesTwoRoom() {
        return statisticsMapper.listhouseTwoRoom();
    }

    @Override
    public List<Map> listhouesThreeRoom() {
        return statisticsMapper.listhouseThreeRoom();
    }


}