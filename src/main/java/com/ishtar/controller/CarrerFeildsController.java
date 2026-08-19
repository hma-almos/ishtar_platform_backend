package com.ishtar.controller;

import com.ishtar.dto.CarrerFeildDto;
import com.ishtar.service.CarrerFeildsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/carer")
public class CarrerFeildsController {
    @Autowired
    private CarrerFeildsService service;
    @PostMapping("/add")
    public void insert(@RequestBody CarrerFeildDto model) {
        service.insert(model);
    }
    @GetMapping("/all")
    public List<CarrerFeildDto> getAll(){
        return service.getAll();
    }
    @GetMapping("/only/{id}")
    public CarrerFeildDto getById(@RequestAttribute Long id){
        return service.getByID(id);
    }
    @PostMapping("/update")
    public void update(@RequestBody CarrerFeildDto model) {
        service.update(model);
    }
}
