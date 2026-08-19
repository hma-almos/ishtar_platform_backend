package com.ishtar.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ishtar.dto.CollageDto;
import com.ishtar.models.CollageModel;
import com.ishtar.service.CollageService;

@RestController()
@RequestMapping("/collage")
public class CollageController {
	@Autowired
	private CollageService service;
	
	@PostMapping("/add")
	public void insert(@RequestBody CollageDto model) {
		System.out.println(model);
		service.insert(model);
	}
	@GetMapping("/all")
	public List<CollageDto> getAll(){
		return service.getAll();
	}
	@GetMapping("/only/{id}")
	public CollageDto getById(@RequestAttribute Long id){
		return service.getByID(id);
	}
	@PostMapping("/update")
	public void update(@RequestBody CollageDto model) {
		service.update(model);
	}
//	@GetMapping("/filter")
//	public List<CollageDto> getAlFilterdl( @RequestParam boolean isPrivate,
//										   @RequestParam String city,
//										   @RequestParam String interest,
//										   @RequestParam String shift,
//										   @RequestParam Double userGpa){
//		return service.findAvailableColleges(isPrivate,city,interest,shift,userGpa);
//	}

}
