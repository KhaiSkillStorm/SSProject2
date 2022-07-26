package com.ssproject2.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssproject2.beans.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
}
