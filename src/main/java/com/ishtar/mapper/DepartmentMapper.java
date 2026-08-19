package com.ishtar.mapper;

import com.ishtar.dto.DepartmentDto;
import com.ishtar.models.Departments;
import org.springframework.stereotype.Component;

@Component
public class DepartmentMapper implements AbstractMapper<Departments, DepartmentDto>{
	
	@Override
	public DepartmentDto mapToDto(Departments model) {
		 return new DepartmentDto(
				model.getId(),
				model.getName(),
				model.getDescription(),
				model.getMinimumGpa(),
				model.getCollege()
				 );      
	}
	@Override
	public Departments mapToModel(DepartmentDto dto) {
		Departments model = new Departments();
		model.setId(dto.id());
        model.setName(dto.name());
        model.setDescription(dto.description());
        model.setMinimumGpa(dto.minimumGpa());
        model.setCollege(dto.college());
        return model;
	}
}


