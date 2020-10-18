package de.riverserene.azure.lookahead;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/greetings")
	public String greetings() {
		return "Greetings Earthlings";
	}
}
