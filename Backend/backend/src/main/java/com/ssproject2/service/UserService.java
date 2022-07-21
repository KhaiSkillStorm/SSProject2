package com.ssproject2.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ssproject2.model.User;
import com.ssproject2.repository.UserRepo;
import com.ssproject2.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

@Transactional
@Service
public class UserService {

    @Autowired
    private UserRepo userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteUserById(id);
    }

    /*
     * public User findUserByUserName(String userName) {
        return userRepository.findUserByUserName(userName)
                .orElseThrow(() -> new UserNotFoundException("This user" + userName + " is not exist"));
    }
     */

    public User findByEmail(String email) {
    return userRepository.findByEmail(email);
    }

}

