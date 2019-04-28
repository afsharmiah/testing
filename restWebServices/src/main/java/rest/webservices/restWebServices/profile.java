package rest.webservices.restWebServices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class profile {
	@RequestMapping("/profile-page")
	public String profilePage() {
		return "THis is a profile page i have created";
		
	}
	

}
