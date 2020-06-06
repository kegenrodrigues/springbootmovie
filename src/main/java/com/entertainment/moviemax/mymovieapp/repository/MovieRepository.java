package com.entertainment.moviemax.mymovieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entertainment.moviemax.mymovieapp.entity.MovieEntity;

public interface MovieRepository extends JpaRepository<MovieEntity, String> {

}
