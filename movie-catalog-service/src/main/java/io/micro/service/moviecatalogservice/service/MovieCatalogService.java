package io.micro.service.moviecatalogservice.service;

import java.util.List;

import io.micro.service.moviecatalogservice.model.CatalogItem;
import io.micro.service.moviecatalogservice.model.User;

public interface MovieCatalogService {

	public List<CatalogItem> getCatalog(String userId);

	public User userLogin(User user);

}
