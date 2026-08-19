package com.ishtar.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ishtar.models.CollageModel;
import com.ishtar.models.Departments;
@Repository
public interface DepartmentRepo extends JpaRepository<Departments, Long>{

}
