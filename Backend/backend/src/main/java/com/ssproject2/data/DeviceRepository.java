package com.ssproject2.data;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ssproject2.beans.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device,Integer>{
	
	@Query("from Device p where p.userId = :userId")
	public List<Device> findByUserIdLike(@Param(value = "userId") int userId);
	
}
