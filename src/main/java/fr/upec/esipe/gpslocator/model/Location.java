package fr.upec.esipe.gpslocator.model;

public class Location {

	private String id;
	private double altitude;
	private double latitude;
	private double longitude;
	
	public Location(double altitude, double latitude, double longitude, String id) {
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

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
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
