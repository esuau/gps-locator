package fr.upec.esipe.gpslocator.model;

import java.util.UUID;


public class Location {

	private String id;
	private Long altitude;
	private Long latitude;
	private Long longitude;
	
	public Location(Long altitude, Long latitude, Long longitude,String id) {
		super();
		this.altitude = altitude;
		this.latitude = latitude;
		this.longitude = longitude;
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public Location() {}

	public Long getAltitude() {
		return altitude;
	}

	public void setAltitude(Long altitude) {
		this.altitude = altitude;
	}

	public Long getLatitude() {
		return latitude;
	}

	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	public Long getLongitude() {
		return longitude;
	}

	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "Location [altitude=" + altitude + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}

	public void setId(String randomUUID) {
		this.id = randomUUID;
	}
	
}
