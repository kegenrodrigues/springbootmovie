package com.entertainment.moviemax.mymovieapp.model;

public class Theater {
	
	private String theaterId;
	private String theaterName;
	private int seatsAvailable; 
	private String city;
	
	public String getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(String theaterId) {
		this.theaterId = theaterId;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public int getSeatsAvailable() {
		return seatsAvailable;
	}
	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Theater() {
		
	}
	
	public Theater(String theaterId, String theaterName, int seatsAvailable, String city) {
		this.theaterId = theaterId;
		this.theaterName = theaterName;
		this.seatsAvailable = seatsAvailable;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Theater [theaterId=" + theaterId + ", theaterName=" + theaterName + ", seatsAvailable=" + seatsAvailable
				+ ", city=" + city + "]";
	}
	
}
