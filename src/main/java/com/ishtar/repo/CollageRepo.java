package com.ishtar.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ishtar.models.CollageModel;
@Repository
public interface CollageRepo extends JpaRepository<CollageModel, Long>{
	// Loads College along with both departments AND career fields in 1 query
    @EntityGraph(attributePaths = {"departments", "careerFields"})
    Optional<CollageModel> findWithDetailsById(Long id);

    @EntityGraph(attributePaths = {"university", "departments", "careerFields","shift"})
    List<CollageModel> findAll();

//    @EntityGraph(attributePaths = {"university"})
//    @Query("""
//        SELECT DISTINCT c FROM CollageModel c
//        JOIN c.shifts s
//        LEFT JOIN c.departments d
//        LEFT JOIN c.careerFields cf
//        WHERE c.isPrivate = :isPrivate
//          AND (:city IS NULL OR :city = '' OR :city = 'ALL' OR LOWER(c.city) = LOWER(:city))
//          AND (
//            :interest IS NULL OR :interest = '' OR :interest = 'ALL'
//            OR LOWER(d.name) LIKE LOWER(CONCAT('%', :interest, '%'))
//            OR LOWER(cf.name) LIKE LOWER(CONCAT('%', :interest, '%'))
//          )
//          AND s.shiftType = :shift
//          AND s.requiredGpa <= :userGpa
//    """)
//    List<CollageModel> findAvailableColleges(
//            @Param("isPrivate") boolean isPrivate,
//            @Param("city") String city,
//            @Param("interest") String interest,
//            @Param("shift") String shift,
//            @Param("userGpa") Double userGpa
//    );
}
