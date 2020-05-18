package io.micro.service.movieinfoservice.resource;

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

	@Autowired
	private MovieInfoService movieInfoService;

	@GetMapping("/{movieId}")
	public MovieInfo getMovieInfo(@PathVariable("movieId") Integer movieId) {

		return movieInfoService.getMovieInfo(movieId);

	}

	@PostMapping("/addMovie")
	public MovieInfo addMovie(@RequestBody MovieInfo movieInfo) {

		return movieInfoService.addMovie(movieInfo);

	}

}
