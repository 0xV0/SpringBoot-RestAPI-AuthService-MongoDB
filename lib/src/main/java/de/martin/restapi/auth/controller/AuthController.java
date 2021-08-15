package de.martin.restapi.auth.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.martin.restapi.auth.jwt.JwtUtil;
import de.martin.restapi.auth.schema.AuthReq;
import de.martin.restapi.auth.schema.AuthResp;
import de.martin.restapi.auth.service.CustomUserDetailsService;

/**
 * @author Martin
 */

@Controller
public class AuthController {

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	private final static Logger log = LoggerFactory.getLogger(AuthController.class);
	
	@RequestMapping(value = "/auth", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthentificationToken(@RequestBody AuthReq authReq) throws Exception {
		try {
			log.info("Authentifikation");
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authReq.getUsername(), authReq.getPassword(), new ArrayList<>())
				);
			
		} catch(BadCredentialsException e) {
			throw new Exception("Falsche Angaben.", e);
		}

		final UserDetails userDetails = customUserDetailsService.loadUserByUsername(authReq.getUsername());
		final String jwt = jwtUtil.generateToken(userDetails);
		
		return ResponseEntity.ok(new AuthResp(jwt));
		
	}
	
}

