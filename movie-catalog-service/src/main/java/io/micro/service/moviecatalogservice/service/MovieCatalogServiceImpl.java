package io.micro.service.moviecatalogservice.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.micro.service.moviecatalogservice.model.CatalogItem;
import io.micro.service.moviecatalogservice.model.MovieInfo;
import io.micro.service.moviecatalogservice.model.Rating;

@Service
public class MovieCatalogServiceImpl implements MovieCatalogService {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<CatalogItem> getCatalog(String userId) {

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		
		ResponseEntity<List<Rating>> result = restTemplate.exchange("http://localhost:8083/rating/" + userId,
				HttpMethod.GET, entity, new ParameterizedTypeReference<List<Rating>>() {
				});

		List<CatalogItem> catalogItems = new ArrayList<>();
		for (Rating rating : result.getBody()) {

			MovieInfo movieInfo = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(),
					MovieInfo.class);
			catalogItems.add(new CatalogItem(movieInfo.getName(), "Test", rating.getRating()));
		}

		return catalogItems;
	}

}
