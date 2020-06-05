package com.entertainment.moviemax.mymovieapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "theatermovieshow")
public class TheaterMovieShowEntity {

	@Column(name = "showid")
	private String showId;
	
	@Column(name = "theaterid")
	private String theaterId;
	
	@Column(name = "movieid")
	private String movieId; 
	
	@Column(name = "showtime")
	private String showtime;
	
	@Column(name = "startdate")
	private Date startdate;
	
	@Column(name = "enddate")
	private Date enddate;
	
	@Column(name = "ticketrate")
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
	
	public TheaterMovieShowEntity() {
		
	}
	public TheaterMovieShowEntity(String showId, String theaterId, String movieId, String showtime, Date startdate,
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
		return "TheaterMovieShowEntity [showId=" + showId + ", theaterId=" + theaterId + ", movieId=" + movieId
				+ ", showtime=" + showtime + ", startdate=" + startdate + ", enddate=" + enddate + ", ticketRate="
				+ ticketRate + "]";
	}

	
	
	
	
}
