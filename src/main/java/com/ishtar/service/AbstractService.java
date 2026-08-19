package com.ishtar.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ishtar.mapper.AbstractMapper;
import com.ishtar.models.AbstractModel;

public abstract class AbstractService<E extends AbstractModel,R extends JpaRepository<E,Long>,M extends AbstractMapper<E, r>,r> {
	@Autowired protected R repo;
	@Autowired protected M mapper;
	public r getByID(Long id) {
		return mapper.mapToDto(repo.findById(id).orElseGet(null));
	}
	public List<r> getAll() {
		return repo.findAll().stream().map(mapper::mapToDto).collect(Collectors.toList());
	}
	public E insert(r entity) {
		return repo.save(mapper.mapToModel(entity));
	}
	public void update(r entity) {
		E model=mapper.mapToModel(entity);
		if(model.getId()==null)
			return ;
		repo.save(model);
	}
	public void delete(r entity) {
		repo.delete(mapper.mapToModel(entity));
	}
}
