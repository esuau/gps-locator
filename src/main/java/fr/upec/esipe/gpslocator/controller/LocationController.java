package fr.upec.esipe.gpslocator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.upec.esipe.gpslocator.model.Location;
import fr.upec.esipe.gpslocator.service.LocationService;

import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {

	@Autowired
	private LocationService locationService;
	
	@PostMapping(value = "/")
	public Location setLocation(@RequestBody Location location) {
        return locationService.setLocation(location);
    }

    @GetMapping(value = "/")
    public List<Location> getAll() {
	    return locationService.getAll();
    }
	
}
