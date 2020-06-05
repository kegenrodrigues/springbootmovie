package com.entertainment.moviemax.mymovieapp.model;

public class Movie{
	
	private String movieId;
	private String movieName;
	private String language;
	private String category;
	private Boolean isLive;
	
	public Movie() {
		
	}
	
	public Movie(String movieId, String movieName, String language, String category, Boolean isLive) {
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
