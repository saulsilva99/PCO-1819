package ex10s3;

public class Agent extends Person {
	String name;
	String ultimoNome;
	public Agent() {
		super();
	}
	public void setFirstname(String s) {
		this.name=s;
	}
	public void setSurname(String s) {
		this.ultimoNome=s;
	}
	/*public String getFirstname() {
		return name;
	}*/
	public String getFirstname() {
		return name;
	}
	
	public String getLastname() {
		return ultimoNome;
	}
	

	public String firstname() {
		return "";
	}
	public String toString() {
		return "My name is " + this.getLastname() + "," + this.getFirstname() + " " + this.getLastname();
	}

}
