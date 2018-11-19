package ex10s3;

public class Person {
	private String name, surname;

	public void setFirstname(String n) {
		name = n;
	}

	public void setSurname(String n) {
		surname = n;
	}
	
	public String firstname() {
		return name;
	}

	public String surname() {
		return surname;
	}

	public String name() {
		return firstname() + " " + surname();
	}

	public String toString() {
		return "My name is " + name();
	}

	



}
