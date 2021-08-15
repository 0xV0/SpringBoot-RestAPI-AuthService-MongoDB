package de.martin.restapi.auth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Martin
 */

@Controller
public class HelloWorldController {

	private final static Logger log = LoggerFactory.getLogger(HelloWorldController.class);
	
	@RequestMapping(value = "/helloworld", method = RequestMethod.GET)
	public ResponseEntity<?> helloWorld() throws Exception {
		log.info("Hallo Welt wurde aufgerufen");
		return ResponseEntity.ok("Hallo Welt.");
	}
}	

