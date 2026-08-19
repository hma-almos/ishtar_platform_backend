package com.ishtar.repo;

import com.ishtar.models.ShiftModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftRepo extends JpaRepository<ShiftModel,Long> {
}
