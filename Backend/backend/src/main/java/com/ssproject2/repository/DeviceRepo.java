package com.ssproject2.repository;
import com.ssproject2.model.Device;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepo extends JpaRepository<Device, Long> {

    void deleteDeviceById(Long id);

    Optional<Device> findDeviceById(Long id);

}