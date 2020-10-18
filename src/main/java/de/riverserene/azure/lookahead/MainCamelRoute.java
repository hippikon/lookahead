package de.riverserene.azure.lookahead;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MainCamelRoute extends RouteBuilder {

	public static final String ROUTE_NAME = "TIMER_ROUTE";
    
	@Override
    public void configure() throws Exception {
        from("timer:initial//start?period=60m")
                .routeId(ROUTE_NAME)
                .to("log:executed");
    }

}
