package com.ssproject2.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssproject2.beans.User;
import com.ssproject2.services.UserService;

@RestController
@RequestMapping("/users/v1")
public class UserController {
    
    private static final Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> models = userService.findAll();
        logger.debug("Models in controller: " + models);
        return new ResponseEntity<List<User>>(models, HttpStatus.OK);
    }

    @GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable int id) {
		return new ResponseEntity<User>(userService.findById(id), HttpStatus.OK);
	}

    
}
