package com.ssproject2.services;

import java.util.List;
import java.util.Optional;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssproject2.beans.User;
import com.ssproject2.data.UserRepository;

@Service
public class UserService {
    
    private static final Logger logger = Logger.getLogger(UserService.class);

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        logger.debug("Grabbing from database");
		List<User> users = repository.findAll();
		logger.debug("returning users: ");
        return users;
    }

    public User findById(int id) {
        User user;
        Optional<User> temp = repository.findById(id);

        if(temp.isPresent()) {
            user = new User(temp.get());
        } else {
            user = new User();
        }
        return user;
    }

}
