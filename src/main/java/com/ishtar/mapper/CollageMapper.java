package com.ishtar.mapper;

import com.ishtar.dto.CollageDto;
import com.ishtar.models.CollageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;
@Component
public class CollageMapper implements AbstractMapper<CollageModel, CollageDto>{
	@Autowired
	UniversityMapper mapper;
	@Autowired
	CarrerFeildsMapper carrerFeildsMapper;
	@Autowired
	DepartmentMapper departmentMapper;
	@Autowired
	ShiftMapper shiftMapper;
	@Override
	public CollageDto mapToDto(CollageModel model) {
		 return new CollageDto(
				 model.getId(),
				 model.getName(),
				 mapper.mapToDto(model.getUniversity()),
				 model.getCity(),
				 model.getIsPrivate(),
				 model.getLogoUrl(),
				 model.getOverview(),
				 model.getEstablishedYear(),
				 model.getRecognitionDocNumber(),
				 model.getExtraInfo(),
				 model.getDepartments()!=null?model.getDepartments().stream().map(departmentMapper::mapToDto).collect(Collectors.toSet()):null,
				 model.getCareerFields()!=null?model.getCareerFields().stream().map(carrerFeildsMapper::mapToDto).collect(Collectors.toSet()):null,
				 model.getLatitude(),
				 model.getLongitude(),
				 model.getGender(),
				 model.getStudyType(),
				 model.getAddress(),
				 model.getShift().stream().map(shiftMapper::mapToDto).collect(Collectors.toList())
				 );
	}
	@Override
	public CollageModel mapToModel(CollageDto dto) {
		CollageModel collageModel = new CollageModel();
		collageModel.setId(dto.id());
        collageModel.setName(dto.name());
        collageModel.setUniversity(mapper.mapToModel(dto.university()));
        collageModel.setCity(dto.city());
        collageModel.setIsPrivate(dto.isPrivate());
        collageModel.setLogoUrl(dto.logoUrl());
        collageModel.setOverview(dto.overview());
        collageModel.setEstablishedYear(dto.establishedYear());
        collageModel.setRecognitionDocNumber(dto.recognitionDocNumber());
        collageModel.setExtraInfo(dto.extraInfo());
        collageModel.setDepartments(dto.departments()!=null?dto.departments().stream().map(departmentMapper::mapToModel).collect(Collectors.toSet()):null);
        collageModel.setCareerFields(dto.careerFields()!=null?dto.careerFields().stream().map(carrerFeildsMapper::mapToModel).collect(Collectors.toSet()):null);
        collageModel.setAddress(dto.address());
        collageModel.setLongitude(dto.longitude());
        collageModel.setLatitude(dto.latitude());
		collageModel.setStudyType(dto.studyType());
		collageModel.setGender(dto.gender());
		collageModel.setShift(
				dto.shift().stream()
						.map(shiftDto -> shiftMapper.mapToModel(shiftDto,collageModel))
						.collect(Collectors.toList())
		);
		return collageModel;
	}
}


