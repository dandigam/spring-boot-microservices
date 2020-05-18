package io.micro.service.ratingdataservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.micro.service.ratingdataservice.model.Rating;

public interface RatingRepository extends MongoRepository<Rating, Integer> {

	public List<Rating> findByUserId(Integer userId);
}
