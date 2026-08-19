package com.ishtar.dto;

import java.util.Set;

import com.ishtar.models.CarrerFeilds;
import com.ishtar.models.CollageModel;
import com.ishtar.models.Departments;
import com.ishtar.models.UniversityModel;

public record UniversityDto(
    Long id,
    String name,
    String description,
    Set<CollageModel> collages
   ) {
}
