package com.ishtar.dto;

import java.util.List;
import java.util.Set;

public record CollageDto(
    Long id,
    String name,
    UniversityDto university,
    String city,
    Boolean isPrivate,
    String logoUrl,
    String overview,
    String establishedYear,
    String recognitionDocNumber,
    String extraInfo,
    Set<DepartmentDto> departments,
    Set<CarrerFeildDto> careerFields,
    Double latitude,
    Double longitude,
    String gender,
    String studyType,
    String address,
    List<ShiftDto> shift) {
}
