package ex10s2;

public class Student extends FacultyPerson {
	public String courseName;
	
	public Student(String nome, int idade, String courseName){
		super(nome,idade);
		this.courseName = courseName;
	}
	
	public String getCourse() {
		return courseName;
	}
	@Override
	public String toString() {
		return "Nome do curso: "+ courseName;
	}

}
