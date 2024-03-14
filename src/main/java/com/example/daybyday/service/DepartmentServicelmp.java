package com.example.daybyday.service;

import com.example.daybyday.dto.DepartmentDTO;
import com.example.daybyday.repository.DepartmentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServicelmp implements DepartmentService {
      private final DepartmentMapper departmentMapper;
          @Override
             public List<DepartmentDTO> findAll(){
              return departmentMapper.listDepartment();
    }
}
