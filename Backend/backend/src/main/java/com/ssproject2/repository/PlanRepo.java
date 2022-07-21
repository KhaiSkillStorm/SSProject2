package com.ssproject2.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ssproject2.model.Plan;

@Repository
public interface PlanRepo extends JpaRepository<Plan, Long> {

	void deletePlanById(Long id);

	Optional<Plan> findPlanById(Long id);
}
