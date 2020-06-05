package com.entertainment.moviemax.mymovieapp.model;

import java.util.Date;


public class TheaterMovieShow {

	private String showId;
	private String theaterId;
	private String movieId; 
	private String showtime;
	private Date startdate;
	private Date enddate;
	private Double ticketRate;
	
	public String getshowId() {
		return showId;
	}
	public void setshowId(String showId) {
		this.showId = showId;
	}
	public String gettheaterId() {
		return theaterId;
	}
	public void settheaterId(String theaterId) {
		this.theaterId = theaterId;
	}
	public String getmovieId() {
		return movieId;
	}
	public void setmovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getShowtime() {
		return showtime;
	}
	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public Double getticketRate() {
		return ticketRate;
	}
	public void setticketRate(Double ticketRate) {
		this.ticketRate = ticketRate;
	}
	
	public TheaterMovieShow() {
		
	}
	public TheaterMovieShow(String showId, String theaterId, String movieId, String showtime, Date startdate,
			Date enddate, Double ticketRate) {
		this.showId = showId;
		this.theaterId = theaterId;
		this.movieId = movieId;
		this.showtime = showtime;
		this.startdate = startdate;
		this.enddate = enddate;
		this.ticketRate = ticketRate;
	}
	@Override
	public String toString() {
		return "TheaterMovieShow [showId=" + showId + ", theaterId=" + theaterId + ", movieId=" + movieId
				+ ", showtime=" + showtime + ", startdate=" + startdate + ", enddate=" + enddate + ", ticketRate="
				+ ticketRate + "]";
	}

	
	
	
	
}
