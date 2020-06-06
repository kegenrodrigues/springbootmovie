package com.entertainment.moviemax.mymovieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entertainment.moviemax.mymovieapp.model.TheaterMovieShow;

public interface TheaterMovieShowRepository extends JpaRepository<TheaterMovieShow,String> {

}
