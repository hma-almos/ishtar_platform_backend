package com.ishtar.mapper;

import com.ishtar.models.AbstractModel;

public interface AbstractMapper <T extends AbstractModel,D>{
	D mapToDto(T model);
    T mapToModel(D dto);
}
