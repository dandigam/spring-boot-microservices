package io.micro.service.movieinfoservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.micro.service.movieinfoservice.model.MovieInfo;
import io.micro.service.movieinfoservice.repository.MovieInfoRepository;

@Service
public class MovieInfoServiceImpl implements MovieInfoService {

	@Autowired
	private MovieInfoRepository movieInfoRepository;

	@Override
	public MovieInfo getMovieInfo(Integer movieId) {
		Optional<MovieInfo> movieInfo = movieInfoRepository.findById(movieId);
		return movieInfo.get();
	}

	@Override
	public MovieInfo addMovie(MovieInfo movieInfo) {
		return movieInfoRepository.save(movieInfo);
	}

}
