package rest.webservices.restWebServices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// controller
@RestController
public class HelloWorldController {
	// GET 
	// URL -/hello-world
	// method-  "hello world"
			@GetMapping(path = "/hello-world")
			public String helloWorld() {
			return "Hello world";
		
	}
			
			//hello-world-bean
			@GetMapping(path = "/hello-world-bean")
			public HelloWorldBean helloWorldBean() {
			return new HelloWorldBean("Hello afshar miah");
		
	}

			
			// creating path variable. tutorial 17
			@GetMapping(path="/hello-world/path-variable/{name}")
			public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
					return new HelloWorldBean(String.format("Hello world,%s",name));
				
			}
			
							
		}
			

