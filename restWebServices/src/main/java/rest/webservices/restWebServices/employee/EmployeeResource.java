package rest.webservices.restWebServices.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResource {
	
	@Autowired
	public EmployeeDaoService service;
	
	@GetMapping("/employees")
	public List<employee>retrieveAllemployees(){
		return service.findAll();
	}
		
	//retrieveUser(int id)
	@GetMapping("/employees/{id}")
	public employee retrieveEmployee(@PathVariable int id) {
		return service.findOne(id);	
	}
		
	}
