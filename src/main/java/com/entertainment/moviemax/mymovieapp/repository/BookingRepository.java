package com.entertainment.moviemax.mymovieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entertainment.moviemax.mymovieapp.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, String> {

}
