package com.ishtar.service;

import com.ishtar.dto.CollageDto;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.ishtar.mapper.CollageMapper;
import com.ishtar.models.CollageModel;
import com.ishtar.repo.CollageRepo;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CollageService extends AbstractService<CollageModel,CollageRepo,CollageMapper, CollageDto>{
//    public List<CollageDto> findAvailableColleges(
//          boolean isPrivate,
//            String city,
//           String interest,
//           String shift,
//           Double userGpa
//    ){
//        return repo.findAvailableColleges(isPrivate,city,interest,shift,userGpa).stream().map(mapper::mapToDto).collect(Collectors.toList());
//    }
}
