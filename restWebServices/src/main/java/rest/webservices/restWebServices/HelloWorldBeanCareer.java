package rest.webservices.restWebServices;

public class HelloWorldBeanCareer {

	private String career;

	public HelloWorldBeanCareer(String career) {
		// TODO Auto-generated constructor stub
		this.career=career;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	@Override
	public String toString() {
		return "HelloWorldBeanCareer [career=" + career + "]";
	}

}
