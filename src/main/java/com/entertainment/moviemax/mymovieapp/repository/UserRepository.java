package com.entertainment.moviemax.mymovieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entertainment.moviemax.mymovieapp.entity.UserEntity;


public interface UserRepository extends JpaRepository<UserEntity, String> {
}
