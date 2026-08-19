package com.ishtar.mapper;

import com.ishtar.dto.UniversityDto;
import com.ishtar.models.UniversityModel;
import org.springframework.stereotype.Component;

@Component
public class UniversityMapper implements AbstractMapper<UniversityModel, UniversityDto>{
	
	@Override
	public UniversityDto mapToDto(UniversityModel model) {
		 return new UniversityDto(
				model.getId(),
				model.getName(),
				model.getDescription(),
				model.getCollages()
				 );      
	}
	@Override
	public UniversityModel mapToModel(UniversityDto dto) {
		UniversityModel model = new UniversityModel();
		model.setId(dto.id());
        model.setName(dto.name());
        model.setDescription(dto.description());
        model.setCollages(dto.collages());
        return model;
	}
}


