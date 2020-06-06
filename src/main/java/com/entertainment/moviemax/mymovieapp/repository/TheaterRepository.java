package com.entertainment.moviemax.mymovieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entertainment.moviemax.mymovieapp.entity.TheaterEntity;

public interface TheaterRepository extends JpaRepository<TheaterEntity, String> {

}
