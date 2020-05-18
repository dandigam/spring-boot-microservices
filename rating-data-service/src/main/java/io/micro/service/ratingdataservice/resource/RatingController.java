package io.micro.service.ratingdataservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micro.service.ratingdataservice.model.Rating;
import io.micro.service.ratingdataservice.service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@Autowired
	private RatingService ratingService;

	@GetMapping("/{userId}")
	public List<Rating> getRating(@PathVariable("userId") Integer userId) {
		return ratingService.findByUserId(userId);
	}
	
	@PostMapping("/addRating")
	public Rating addRating(@RequestBody Rating rating) {
		return ratingService.addRating(rating);
	}
}
