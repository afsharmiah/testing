package rest.webservices.restWebServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class careerController {
	
	@GetMapping(path = "/career")
	public String career() {
		return "This is a career page.";
		
	}

}
