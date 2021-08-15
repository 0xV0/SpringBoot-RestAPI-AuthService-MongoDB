package de.martin.restapi.auth.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import de.martin.restapi.auth.entity.UserEntity;

public interface UserRepo extends MongoRepository<UserEntity, String>{

	UserEntity findByUsername(String userName);

}
