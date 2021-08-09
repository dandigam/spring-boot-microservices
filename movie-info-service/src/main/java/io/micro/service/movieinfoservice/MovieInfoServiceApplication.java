package io.micro.service.movieinfoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import io.micro.service.movieinfoservice.model.MovieInfo;
import io.micro.service.movieinfoservice.repository.MovieInfoRepository;

@SpringBootApplication
@EnableEurekaClient
public class MovieInfoServiceApplication implements CommandLineRunner {

	@Autowired
	private MovieInfoRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		MovieInfo movie = new MovieInfo();
		movie.setName("war");
		movie.setUserId(1L);
		//repo.save(movie);
	}

}
