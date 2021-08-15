package de.martin.restapi.auth.schema;

/**
 * @author Martin
 */

public class AuthResp {

	private final String jwt;
	
	public AuthResp(String jwt) {
		this.jwt = jwt;
	}
	
	public String getJwt() {
		return jwt;
	}
	
}