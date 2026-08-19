package com.ishtar.mapper;

import com.ishtar.dto.CarrerFeildDto;
import com.ishtar.models.CarrerFeilds;
import org.springframework.stereotype.Component;

@Component
public class CarrerFeildsMapper implements AbstractMapper<CarrerFeilds, CarrerFeildDto>{
	
	@Override
	public CarrerFeildDto mapToDto(CarrerFeilds model) {
		 return new CarrerFeildDto(
				model.getId(),
				model.getName(),
				model.getDescription()
				 );      
	}
	@Override
	public CarrerFeilds mapToModel(CarrerFeildDto dto) {
		CarrerFeilds model = new CarrerFeilds();
		model.setId(dto.id());
        model.setName(dto.name());
        model.setDescription(dto.description());
        return model;
	}
}


