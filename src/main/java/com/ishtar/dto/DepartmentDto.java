package com.ishtar.dto;

import java.util.Set; 

import com.ishtar.models.CollageModel;

public record DepartmentDto(
    Long id,
    String name,
    String description,
    Double minimumGpa,
    CollageModel college
   ) {
}
