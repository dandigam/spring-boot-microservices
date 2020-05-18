package io.micro.service.moviecatalogservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micro.service.moviecatalogservice.model.CatalogItem;
import io.micro.service.moviecatalogservice.service.MovieCatalogService;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	@Autowired
	private MovieCatalogService movieCatalogService;

	@GetMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

		return movieCatalogService.getCatalog(userId);

	}

}
