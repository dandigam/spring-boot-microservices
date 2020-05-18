package io.micro.service.ratingdataservice.service;

import java.util.List;

import io.micro.service.ratingdataservice.model.Rating;

public interface RatingService {
	
	public Rating addRating(Rating rating);

	public List<Rating> findByUserId(Integer userId);
	
}
