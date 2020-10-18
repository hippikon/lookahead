package de.riverserene.azure.lookahead.auth;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.riverserene.azure.lookahead.model.User;

@RestController
public class GoogleAuthRoutes extends RouteBuilder {

	public static final String ROUTE_NAME = "TIMER_ROUTE";
    
	@PostMapping("/authenticate")
	@Override
    public void authenticate(@RequestBody User user) throws Exception {
        from("timer:initial//start?period=60m")
                .routeId(ROUTE_NAME)
                .to("log:executed");
    }

}
