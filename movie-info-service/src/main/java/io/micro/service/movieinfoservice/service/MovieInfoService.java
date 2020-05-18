package io.micro.service.movieinfoservice.service;

import io.micro.service.movieinfoservice.model.MovieInfo;

public interface MovieInfoService {

	MovieInfo getMovieInfo(Integer movieId);

	MovieInfo addMovie(MovieInfo movieInfo);

}
