package com.example.daybyday.repository;

import com.example.daybyday.dto.DepartmentDTO;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
/*@Repository*/
@Mapper

public interface DepartmentMapper {
    List<DepartmentDTO> listDepartment();
}
