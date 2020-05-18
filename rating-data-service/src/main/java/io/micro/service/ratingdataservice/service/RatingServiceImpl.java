package io.micro.service.ratingdataservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.micro.service.ratingdataservice.model.Rating;
import io.micro.service.ratingdataservice.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public Rating addRating(Rating rating) {
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> findByUserId(Integer userId) {
		return ratingRepository.findByUserId(userId);
	}

}
