package com.ishtar.controller;

import com.ishtar.dto.CollageDto;
import com.ishtar.dto.UniversityDto;
import com.ishtar.mapper.UniversityMapper;
import com.ishtar.service.CollageService;
import com.ishtar.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController()
@RequestMapping("/uni")
public class UniversityController {
    @Autowired
    private UniversityService service;
    @Autowired
    private UniversityMapper mapper;
    @PostMapping("/add")
    public UniversityDto insert(@RequestBody UniversityDto model) {
        return mapper.mapToDto(service.insert(model));
    }
    @GetMapping("/all")
    public List<UniversityDto> getAll(){
        return service.getAll();
    }
    @GetMapping("/only/{id}")
    public UniversityDto getById(@RequestAttribute Long id){
        return service.getByID(id);
    }
    @PostMapping("/update")
    public void update(@RequestBody UniversityDto model) {
        service.update(model);
    }
}
