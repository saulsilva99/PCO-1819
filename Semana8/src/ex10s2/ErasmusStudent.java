package ex10s2;

public class ErasmusStudent extends Student {
	String pais;

	public ErasmusStudent(String nome, int idade, String courseName, String pais) {
		super(nome,idade,courseName);
		this.pais = pais;
	}
	public String getCountry() {
		return pais;
	}
	@Override
	public String toString() {
		return "O nome do pais: " + pais;
	}
}
