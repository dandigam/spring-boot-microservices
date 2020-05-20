package io.micro.service.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.micro.service.userservice.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {
	
	public User findByEmailAndPassWord(String email,String passWord);

}
