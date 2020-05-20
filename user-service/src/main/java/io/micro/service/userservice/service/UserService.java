package io.micro.service.userservice.service;

import io.micro.service.userservice.model.User;

public interface UserService {
	
	public User addUser(User user);

	public User userlogin(User user);

}
