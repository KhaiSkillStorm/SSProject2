package com.ssproject2.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ssproject2.beans.Device;
import com.ssproject2.beans.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
//    
//	@Query("select phoneid,phone_num,isAssigned,userId,device from users join phone_numbers where userId = pk_id AND username = :name")
//	public List<Device> findPhoneByUsername(@Param(value = "name") String name);
}
