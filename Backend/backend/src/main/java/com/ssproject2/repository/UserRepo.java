package com.ssproject2.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssproject2.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    void deleteUserById(Long id);

    Optional<UserRepo> findUserByUserName(String userName);

    User findByEmail(String email);

}
