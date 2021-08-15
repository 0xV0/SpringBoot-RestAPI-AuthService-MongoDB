package de.martin.restapi.auth.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class UserEntity {

	@Id
	private long id;
	private String username;
	private String password;
	
	public UserEntity(long id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	//Getter & Setter ID
	public Long getId() {
		return id;
	}
	
	public void setId(long id) {
		 this.id = id;
	}
	
	//Getter & Setter Username
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	//Getter & Setter Passwort
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}