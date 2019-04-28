package rest.webservices.restWebServices;

public class GreetingspathVariable {

	private Object greetings;

	public GreetingspathVariable(String greetings) {
		// TODO Auto-generated constructor stub
		this.greetings=greetings;
	}

	public Object getGreetings() {
		return greetings;
	}

	public void setGreetings(Object greetings) {
		this.greetings = greetings;
	}

	@Override
	public String toString() {
		return "GreetingspathVariable [greetings=" + greetings + "]";
	}

}
