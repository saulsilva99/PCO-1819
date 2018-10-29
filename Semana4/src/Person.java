
public class Person {
	public String PersonName;
	public int PersonAge;
	
	public Person(String n, int a) {
		String PersonName = n;	
		int PersonAge = a;
	}
	
	public String getName() {
		return PersonName;
	}
	public void setName(String name) {
		PersonName = name;
	}
	public int getAge() {
		return this.PersonAge;
	}
	
	public void setAge(int age) {
		PersonAge = age;
	}

	public String toString() {
		return "Person name: " + PersonName + " Person Age " + PersonAge;
	}
	
	
	

}
