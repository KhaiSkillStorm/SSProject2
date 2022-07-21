package com.ssproject2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssproject2.model.Plan;
import com.ssproject2.repository.PlanRepo;
import lombok.extern.slf4j.Slf4j;
@Slf4j

@Service
public class PlanService {
	private PlanRepo planRepo;
    
	@Autowired
	private PlanRepo planRepository;

	public Plan addPlan(Plan plan) {
		log.info("Saving new phone plan: {}", plan.getPlanName());
		return planRepository.save(plan);
	}

	public List<Plan> findAllPlans() {
		log.info("Getting all Phone Plans");
		return planRepository.findAll();
	}

	public Plan updatePlan(Plan plan) {
		log.info("Updating phone plan: {}", plan.getPlanName());
		return planRepository.save(plan);
	}

	public void deletePlan(Long id) {
		log.info("Deleting phone plan Id: {}", id);
		planRepository.deletePlanById(id);
	}

	/*
	 * public Plan findPlanById(Long id) {
		log.info("Getting Phone Plan Id: {}", id);
		return planRepository.findPlanById(id)
				.orElseThrow(() -> new PlanNotFoundException("Plan with id" + id + " was not found"));
	}
	 * 
	 */
	

}
