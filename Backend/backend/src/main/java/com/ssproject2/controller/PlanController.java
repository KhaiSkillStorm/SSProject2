package com.ssproject2.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssproject2.beans.Plan;
import com.ssproject2.services.PlanService;

@RestController
@RequestMapping("/plans/v1")
@CrossOrigin("http://localhost:4200")
public class PlanController {
	 private static final Logger logger = Logger.getLogger(PlanController.class);
	 
	 @Autowired
	 PlanService planService;
	 
	 @GetMapping
	 public ResponseEntity<List<Plan>> findAll() {
		 logger.info("Calling findAll request through http");
		 return new ResponseEntity<List<Plan>>(planService.findAll(), HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Plan> findById(@PathVariable int id) {
		 logger.info("Calling findById request through http");
		 return new ResponseEntity<Plan>(planService.findById(id), HttpStatus.OK);
		}
	 
}
