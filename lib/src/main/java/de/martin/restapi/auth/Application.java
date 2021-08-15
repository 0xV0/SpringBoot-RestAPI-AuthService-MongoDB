package de.martin.restapi.auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.martin.restapi.auth.entity.UserEntity;
import de.martin.restapi.auth.repos.UserRepo;

import org.springframework.boot.CommandLineRunner;

/**
 * @author Martin
 */

@SpringBootApplication
public class Application implements CommandLineRunner{

	private final static Logger log = LoggerFactory.getLogger(Application.class);
	
	@Autowired
	private UserRepo repo;
	
	public static void main(String[] args) {
		log.info("Starte Programm...");
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		log.info("Initialisiere Testzugang...");
		if (repo.findAll().isEmpty()) {
			UserEntity user1 = new UserEntity(1234567, "test", "test");
			repo.insert(user1);
		}

	}
}

