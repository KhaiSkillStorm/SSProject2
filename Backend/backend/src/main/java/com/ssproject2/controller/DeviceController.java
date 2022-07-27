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

import com.ssproject2.beans.Device;
import com.ssproject2.services.DeviceService;

@RestController
@RequestMapping("/devices/v1")
@CrossOrigin("http://localhost:4200")
public class DeviceController {
	
	private static final Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	DeviceService deviceService;
	
	 
	 @GetMapping
	 public ResponseEntity<List<Device>> findAll() {
		 logger.info("Calling findAll request through http");
		 return new ResponseEntity<List<Device>>(deviceService.findAll(), HttpStatus.OK);
	 }
	 
	 @GetMapping("/id/{id}")
	 public ResponseEntity<Device> findById(@PathVariable int id) {
		 logger.info("Calling findById request through http");
		 return new ResponseEntity<Device>(deviceService.findById(id), HttpStatus.OK);
		}
	 @GetMapping("/userId/{userId}")
	 public ResponseEntity<List<Device>> findByUsername(@PathVariable int userId){
		 logger.info("Finding a userid");
		 return new ResponseEntity<List<Device>>(deviceService.findByUserId(userId),HttpStatus.OK);
	 }
}
