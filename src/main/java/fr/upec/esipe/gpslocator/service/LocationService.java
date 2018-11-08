package fr.upec.esipe.gpslocator.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import fr.upec.esipe.gpslocator.model.Location;

@Service
public class LocationService {

	private List<Location> locations = new ArrayList<>();

	public Location setLocation(Location location) {
		location.setId(UUID.randomUUID().toString());
		this.locations.add(location);
		return location;
	}

	public List<Location> getAll() {
	    return this.locations;
    }

}
