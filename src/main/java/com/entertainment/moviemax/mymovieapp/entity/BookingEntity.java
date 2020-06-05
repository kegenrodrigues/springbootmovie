package com.entertainment.moviemax.mymovieapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "booking")
public class BookingEntity {

	@Id
	@Column(name = "bookingid")
	private int bookingId;
	
	@Column(name = "bookingid")
	private String userId;
	
	@Column(name = "bookingid")
	private String showId;
	
	@Column(name = "bookingid")
	private int noOfSeats;
	
	@Column(name = "bookingid")
	private double amountPaid;
	
	@Column(name = "bookingid")
	private Date showDate;
	
	@Column(name = "bookingid")
	private Date bookingDate;
	
	public int getBookingid() {
		return bookingId;
	}
	public void setBookingid(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getUserid() {
		return userId;
	}
	public void setUserid(String userId) {
		this.userId = userId;
	}
	public String getShowid() {
		return showId;
	}
	public void setShowid(String showId) {
		this.showId = showId;
	}
	public int getNoofseats() {
		return noOfSeats;
	}
	public void setNoofseats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public double getAmountpaid() {
		return amountPaid;
	}
	public void setAmountpaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}
	public Date getShowdate() {
		return showDate;
	}
	public void setShowdate(Date showDate) {
		this.showDate = showDate;
	}
	public Date getBookingdate() {
		return bookingDate;
	}
	public void setBookingdate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	
	public BookingEntity() {
		
	}
	
	public BookingEntity(int bookingId, String userId, String showId, int noOfSeats, double amountPaid, Date showDate,
			Date bookingDate) {
		this.bookingId = bookingId;
		this.userId = userId;
		this.showId = showId;
		this.noOfSeats = noOfSeats;
		this.amountPaid = amountPaid;
		this.showDate = showDate;
		this.bookingDate = bookingDate;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", showId=" + showId + ", noOfSeats="
				+ noOfSeats + ", amountPaid=" + amountPaid + ", showDate=" + showDate + ", bookingDate=" + bookingDate
				+ "]";
	}
	
}
