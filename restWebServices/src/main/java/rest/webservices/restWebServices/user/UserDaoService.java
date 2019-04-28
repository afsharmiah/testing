package rest.webservices.restWebServices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.catalina.realm.UserDatabaseRealm;
import org.springframework.stereotype.Component;

import rest.webservices.restWebServices.employee.employee;

@Component
public class UserDaoService {

	private static List<User> users=new ArrayList<>();
	
	private static int usersCount=3;
	
	static {
		users.add(new User(1,"afshar miah", new Date()));
		users.add(new User(2,"afroza chowdhury", new Date()));
		users.add(new User(3,"sumona chowdhury", new Date()));
	}
	
	
	// find all users
	 public List<User> findAll(){
		 return users;
	 }
	 
	 // save
	 /*
	  public User save(User user) {
		 if(user.getId()==null) {
			 user.setId(++usersCount);
		 }
		users.add(user);
		return user;
	
	 }
	  */
	 
		
		
	
	 
	 
	 // save one user
	
	// finding one specific id
	public User findOne(int id){
		for(User user: users) {
			if(user.getId()==id) {
				return user;
			
		}
	}
		return null;
}
	
}
