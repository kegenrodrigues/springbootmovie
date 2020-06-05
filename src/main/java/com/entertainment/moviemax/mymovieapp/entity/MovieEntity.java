package com.entertainment.moviemax.mymovieapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class MovieEntity {

	@Id
	@Column(name = "movieid")
	private String movieId;
	
	@Column(name = "moviename")
	private String movieName;
	
	@Column(name = "language")
	private String language;
	
	@Column(name = "category")
	private String category;

	@Column(name = "islive")
	private Boolean isLive;
	
	public MovieEntity() {
		
	}
	
	public MovieEntity(String movieId, String movieName, String language, String category, Boolean isLive) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.language = language;
		this.category = category;
		this.isLive = isLive;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Boolean getIsLive() {
		return isLive;
	}
	public void setIsLive(Boolean isLive) {
		this.isLive = isLive;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	@Override
	public String toString() {
		return "MovieEntity [movieId=" + movieId + ", movieName=" + movieName + ", language=" + language + ", category="
				+ category + ", isLive=" + isLive + "]";
	}
	
	
	
}
