package fr.upec.esipe.gpslocator.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import fr.upec.esipe.gpslocator.model.Location;

@Service
public class LocationService {

	
	
	
	public Location setLocation(Location location) {
		location.setId(UUID.randomUUID().toString());
		
		return location;
	}

}
