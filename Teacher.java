
/*
 * Teacher class, used in the school, contains a first name, last name, and a subject
 */

public class Teacher { // Teacher class
	
	String firstName; // Create first name variable
	String lastName; // Create last name variable
	String subject; // Create subject variable
	
	public Teacher(String name, String surname, String sub) { // Teacher constructor
		firstName = name; // Initialize first name
		lastName = surname; // Initialize last name
		subject = sub; // Initialize subject
	}
	
	public void setFirstName(String name) {
		firstName = name;
	}
	
	public void setLastName(String name) {
		lastName = name;
	}
	
	public void setSubject(String sub) {
		subject = sub;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
		
	}
	
	public String getSubject() {
		return subject;
	}
}
