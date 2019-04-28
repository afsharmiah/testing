package rest.webservices.restWebServices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	@Autowired
	private UserDaoService service;
	// Get /users
	//retrieveAllUsers
	@GetMapping("/users")
	public List<User>retrieveAllusers(){
		return service.findAll();
	}
	
	
	/*
	@PostMapping("/users")
	public void createUser(@RequestBody User user) {
		User savedUser =service.save(user);
			
	}
	*/
	
	// Get method for retrieve users and error handling method. 
	//retrieveUser(int id)
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id) {
		User user= service.findOne(id);	
		if(user==null)
			throw new UserNotFoundException("id-"+id);
		return user;
	}

	
}
