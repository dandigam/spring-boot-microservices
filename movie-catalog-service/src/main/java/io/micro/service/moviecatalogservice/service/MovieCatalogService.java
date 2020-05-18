package io.micro.service.moviecatalogservice.service;

import java.util.List;

import io.micro.service.moviecatalogservice.model.CatalogItem;

public interface MovieCatalogService {

	public List<CatalogItem> getCatalog(String userId);

}
