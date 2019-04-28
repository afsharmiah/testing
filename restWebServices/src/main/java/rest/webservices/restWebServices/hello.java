package rest.webservices.restWebServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
	@GetMapping(path = "/home")
	
	public String helloWorld() {
		return "Hello afshar , this is web services page";
		
	}

}
