package com.ishtar.service;

import com.ishtar.dto.DepartmentDto;
import org.springframework.stereotype.Service;

import com.ishtar.mapper.DepartmentMapper;
import com.ishtar.models.Departments;
import com.ishtar.repo.DepartmentRepo;

@Service
public class DepartmentService extends AbstractService<Departments,DepartmentRepo,DepartmentMapper, DepartmentDto>{
	
}
