package com.ishtar.mapper;

import com.ishtar.dto.ShiftDto;
import com.ishtar.models.AbstractModel;
import com.ishtar.models.CollageModel;
import com.ishtar.models.ShiftModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShiftMapper implements AbstractMapper<ShiftModel, ShiftDto>{
    @Override
    public ShiftDto mapToDto(ShiftModel model) {
        return new ShiftDto(model.getId(),model.getShift(),model.getRequiredGpa(),model.getCost());
    }

    @Override
    public ShiftModel mapToModel(ShiftDto dto) {
        return new ShiftModel(dto.id(),null,dto.shift(),dto.requiredGpa(),dto.cost());
    }
    public ShiftModel mapToModel(ShiftDto dto,CollageModel collage) {
        return new ShiftModel(dto.id(),collage,dto.shift(),dto.requiredGpa(),dto.cost());
    }
}
