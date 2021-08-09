package io.micro.service.movieinfoservice.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.micro.service.movieinfoservice.model.MovieInfo;
import io.micro.service.movieinfoservice.repository.MovieInfoRepository;

@Service
public class MovieInfoServiceImpl implements MovieInfoService {

	private static final Logger logger = LoggerFactory.getLogger(MovieInfoServiceImpl.class);

	@Autowired
	private MovieInfoRepository movieInfoRepository;

	@Override
	public MovieInfo getMovieInfo(Long movieId) {
		Optional<MovieInfo> movieInfo = movieInfoRepository.findById(movieId);
		logger.info(">>>>>> getMovieInfo>>>>>>>> movie id " + movieInfo);
		return movieInfo.get();
	}

	@Override
	public MovieInfo addMovie(MovieInfo movieInfo) {
		logger.info(">>>>>> addMovie>>>>>>>> movie ", movieInfo);
		return movieInfoRepository.save(movieInfo);
	}

}
