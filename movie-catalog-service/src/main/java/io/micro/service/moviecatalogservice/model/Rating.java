package io.micro.service.moviecatalogservice.model;

import java.io.Serializable;

public class Rating implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int ratingId;

	private int movieId;

	private int rating;

	private int userId;

	Rating() {

	}

	public Rating(int ratingId, int movieId, int rating, int userId) {
		super();
		this.ratingId = ratingId;
		this.movieId = movieId;
		this.rating = rating;
		this.userId = userId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getRatingId() {
		return ratingId;
	}

	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}

}
