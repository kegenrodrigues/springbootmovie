package com.entertainment.moviemax.mymovieapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "theater")
public class TheaterEntity {
	
	@Id
	@Column(name = "theaterid")
	private String theaterId;
	
	@Column(name = "theatername")
	private String theaterName;
	
	@Column(name = "seatsavailable")
	private int seatsAvailable;
	
	@Column(name = "city")
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
	
	public TheaterEntity() {
		
	}
	
	public TheaterEntity(String theaterId, String theaterName, int seatsAvailable, String city) {
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
