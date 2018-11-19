package ex10s2;

/**
 * Class representing a person.
 * 
 * @author Eduardo Marques DI/FCUL, 2012-2014
 */
public class FacultyPerson {
	// STATIC FIELDS
	/**
	 * Person id counter. This is a static class field, used internally to generate
	 * unique identifiers for each Person instance.
	 */
	private static int PERSON_ID_COUNTER = 0;
	// INSTANCE FIELDS
	/**
	 * Unique person ID.
	 */
	private int id;
	/**
	 * Name.
	 */
	private String name;
	/**
	 * Age.
	 */
	private int age;

	// CONSTRUCTOR
	/**
	 * Constructor. The person name and age are initialized according to the given
	 * arguments, an unique id is generated for the person, and the person status is
	 * initially inactive.
	 * 
	 * @param name
	 *            Person name.
	 * @param age
	 *            Person age.
	 */
	public FacultyPerson(String name, int age) {
		this.id = PERSON_ID_COUNTER++;
		this.name = name;
		this.age = age;
	}

	/**
	 * Get textual representation of person.
	 * 
	 * @return A {@code String} object with information for the person.
	 */
	@Override
	public String toString() {
		return String.format("Id: %d Name: %s Age: %d", id, name, age);
	}

	/**
	 * Get name.
	 * 
	 * @return The name of the person.
	 */
	public final String getName() {
		return name;
	}

	/**
	 * Get age.
	 * 
	 * @return The age of the person.
	 */
	public final int getAge() {
		return age;
	}

	/**
	 * Get ID.
	 * 
	 * @return The ID of the person.
	 */
	public final int getId() {
		return id;
	}
}
