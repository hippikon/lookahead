package de.riverserene.azure.lookahead;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/greetings/{name}")
	public String greetings(@PathVariable String name) {
		return toStringGreeting("Greetings","Earthlings");
	}

	private String toStringGreeting(String greetings, String earthlings) {
		return greetings + " " + earthlings;
	}
}
