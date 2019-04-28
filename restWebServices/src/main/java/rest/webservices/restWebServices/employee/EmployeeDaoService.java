package rest.webservices.restWebServices.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoService {
private static List<employee> employees=new ArrayList<>();

	
	static {
		employees.add(new employee(1,"afshar miah", 31));
		employees.add(new employee(2,"afroza chowdhury", 22));
		employees.add(new employee(3,"sumona chowdhury", 22));
	}
	
	
	// find all users
	 public List<employee> findAll(){
		 return employees;
	 }
	 
	 
	 // save one user
	
	// finding one specific id
	public employee findOne(int id){
		for(employee employee: employees) {
			if(employee.getId()==id) {
				return employee;
			
		}
	}
		return null;
	
	
}
}