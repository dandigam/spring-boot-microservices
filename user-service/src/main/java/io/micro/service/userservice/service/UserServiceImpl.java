package io.micro.service.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.micro.service.userservice.model.User;
import io.micro.service.userservice.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public User addUser(User user) {
		userRepository.save(user);
		return user;
	}

}
