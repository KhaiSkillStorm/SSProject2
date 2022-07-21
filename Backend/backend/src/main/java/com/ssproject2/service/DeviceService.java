package com.ssproject2.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.ssproject2.model.Device;

import com.ssproject2.repository.DeviceRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Transactional
@Service
public class DeviceService {
    @Autowired
    private DeviceRepo deviceRepository;

    public Device addDevice(Device device) {
        return deviceRepository.save(device);
    }

    public List<Device> findAllDevices() {
        return deviceRepository.findAll();
    }

    public Device updateDevice(Device device) {
        return deviceRepository.save(device);
    }

    public void deleteDeviceById(Long id) {
        deviceRepository.deleteDeviceById(id);
    }

    /*
     * public Device findDeviceById(Long id) {
        return deviceRepository.findDeviceById(id)
                .orElseThrow(() -> new PlanNotFoundException("Device with id" + id + " was not found"));
    }
     */
    
}
