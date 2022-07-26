package com.ssproject2.services;

import java.util.List;
import java.util.Optional;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssproject2.beans.Plan;
import com.ssproject2.data.PlanRepository;

@Service
public class PlanService {
	
	private static final Logger logger = Logger.getLogger(PlanService.class);
	
	@Autowired
	private PlanRepository repository;
	
    public List<Plan> findAll() {
        logger.debug("Grabbing from database");
		List<Plan> plans = repository.findAll();
		logger.debug("returning plans: ");
        return plans;
    }
    public Plan addPlan(Plan plan) {
		logger.info("Saving new phone plan: " +  plan.getName());
		return repository.save(plan);
	}

    public Plan findById(int id) {
        Plan plan;
        Optional<Plan> temp = repository.findById(id);

        if(temp.isPresent()) {
            plan = new Plan(temp.get());
        } else {
            plan = new Plan();
        }
        return plan;
    }
    
    public void deletePlan(int id) {
    	repository.deleteById(id);
    }
    

    

    
}
