package com.ssproject2.services;

import java.util.List;
import java.util.Optional;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssproject2.data.DeviceRepository;
import com.ssproject2.beans.Device;
@Service
public class DeviceService {

	private static final Logger logger = Logger.getLogger(DeviceService.class);
	@Autowired
	private DeviceRepository repository;
	
	public List<Device> findAll() {
		logger.info("finding all devices");
		return repository.findAll();
	}
	
	public Device findById(int id) {
        Device device;
        Optional<Device> temp = repository.findById(id);

        if(temp.isPresent()) {
        	logger.info("found device with id : " + id);
            device = new Device(temp.get());
        } else {
            device = new Device();
        }
        
        return device;
	}
}
