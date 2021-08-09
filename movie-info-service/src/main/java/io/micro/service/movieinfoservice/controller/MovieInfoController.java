package io.micro.service.movieinfoservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micro.service.movieinfoservice.model.MovieInfo;
import io.micro.service.movieinfoservice.service.MovieInfoService;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

	private static final Logger logger = LoggerFactory.getLogger(MovieInfoController.class);

	@Autowired
	private MovieInfoService movieInfoService;

	@GetMapping("/{movieId}")
	public MovieInfo getMovieInfo(@PathVariable("movieId") Long movieId) {
		logger.info(">>>>>> getMovieInfo>>>>>>>> movie id " + movieId);
		return movieInfoService.getMovieInfo(movieId);

	}

	@PostMapping("/movie")
	public MovieInfo addMovie(@RequestBody MovieInfo movieInfo) {
		logger.info(">>>>>>>addMovie>>>>>", movieInfo);
		return movieInfoService.addMovie(movieInfo);

	}

}
