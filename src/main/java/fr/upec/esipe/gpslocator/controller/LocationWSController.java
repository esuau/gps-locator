package fr.upec.esipe.gpslocator.controller;

import fr.upec.esipe.gpslocator.model.Location;
import fr.upec.esipe.gpslocator.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class LocationWSController {

    @Autowired
    private LocationService service;

    @MessageMapping("/locations")
    @SendTo("/topic/locations")
    public List<Location> getAll() {
        return service.getAll();
    }

}
