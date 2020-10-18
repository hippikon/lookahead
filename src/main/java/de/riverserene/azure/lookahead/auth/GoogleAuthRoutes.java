package de.riverserene.azure.lookahead.auth;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.riverserene.azure.lookahead.model.User;

@RestController
public class GoogleAuthRoutes extends RouteBuilder {

	@PostMapping("/authenticate")
    public void authenticate(@RequestBody User user) throws Exception {
    }

	@Override
	public void configure() throws Exception {
	}

}
