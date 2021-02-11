
/*
 * Student class, used in the school, contains a first name, last name, grade, and a student number
 */

public class Student { // Student Class
	String firstName; // Create first name variable
	String lastName; // Create last name variable
	int grade; // Create grade integer
	int studentNumber; // Create student number integer
	
	public Student(String name, String surname, int year) { // Student constructor
		firstName = name; // Initialize first name
		lastName = surname; // Initialize last name
		grade = year; // Initialize grade
		studentNumber = (int)(Math.random() * (9999999 - 1000000)); // Initialize student number to random number from 1000000 to 9999999
		//System.out.print(studentNumber); // Print student number
	}
	
	public void setFirstName(String name) {
		firstName = name;
	}
	
	public void setLastName(String surname) {
		lastName = surname;
	}
	
	public void setGrade(int year) {
		grade = year;
	}
	
	public void setStudentNumber(int number) {
		studentNumber = number;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}
}
