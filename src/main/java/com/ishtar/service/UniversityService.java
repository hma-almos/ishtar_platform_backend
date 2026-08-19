package com.ishtar.service;

import com.ishtar.dto.UniversityDto;
import org.springframework.stereotype.Service;

import com.ishtar.mapper.UniversityMapper;
import com.ishtar.models.UniversityModel;
import com.ishtar.repo.UniversityRepo;

@Service
public class UniversityService extends AbstractService<UniversityModel,UniversityRepo,UniversityMapper, UniversityDto>{
	
}
