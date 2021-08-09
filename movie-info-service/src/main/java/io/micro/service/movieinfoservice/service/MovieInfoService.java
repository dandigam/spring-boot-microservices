package io.micro.service.movieinfoservice.service;

import io.micro.service.movieinfoservice.model.MovieInfo;

public interface MovieInfoService {

	MovieInfo getMovieInfo(Long movieId);

	MovieInfo addMovie(MovieInfo movieInfo);

}
