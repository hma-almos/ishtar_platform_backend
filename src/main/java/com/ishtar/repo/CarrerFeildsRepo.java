package com.ishtar.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ishtar.models.CarrerFeilds;
import com.ishtar.models.CollageModel;
@Repository
public interface CarrerFeildsRepo extends JpaRepository<CarrerFeilds, Long>{
	
}
