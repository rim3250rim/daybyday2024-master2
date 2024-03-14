package com.example.daybyday.service;


import com.example.daybyday.repository.PersonMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class PersonServicelmp implements PersonService {

    private  final PersonMapper personMapper;
    @Override
    public List<Map<String, Object>> listPersonHome() {
        return personMapper.listPersonHome();
    }
}
