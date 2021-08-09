package io.micro.service.movieinfoservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "app_movie_info")
public class MovieInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long movieId;

	private Long userId;

	private String name;

}
