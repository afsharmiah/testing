package rest.webservices.restWebServices;

public class GreetingBean {

	private String greetings;

	public GreetingBean(String greetings) {
		// TODO Auto-generated constructor stub
		this.greetings=greetings;
	}

	@Override
	public String toString() {
		return "GreetingBean [greetings=" + greetings + "]";
	}

	public String getGreetings() {
		return greetings;
	}

	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}

}
