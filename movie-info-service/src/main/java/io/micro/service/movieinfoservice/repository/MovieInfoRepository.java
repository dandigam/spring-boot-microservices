package io.micro.service.movieinfoservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.micro.service.movieinfoservice.model.MovieInfo;

public interface MovieInfoRepository extends MongoRepository<MovieInfo, Integer> {

}
