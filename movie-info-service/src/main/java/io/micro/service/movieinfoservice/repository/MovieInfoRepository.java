package io.micro.service.movieinfoservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.micro.service.movieinfoservice.model.MovieInfo;

@Repository
public interface MovieInfoRepository extends JpaRepository<MovieInfo, Long> {

}
