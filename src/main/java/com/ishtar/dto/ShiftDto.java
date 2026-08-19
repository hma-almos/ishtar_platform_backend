package com.ishtar.dto;

import com.ishtar.enums.StudyShift;

public record ShiftDto(
        Long id,
        StudyShift shift,
        Double requiredGpa,
        Integer cost) {
}
