import java.util.ArrayList; // import ArrayList for later use

/*
 * School class, used for adding students and teachers, all with unique properties
 */

public class School { // School class
	
	ArrayList<Teacher> Teachers = new ArrayList<Teacher>(); // Create Teachers List
	ArrayList<Student> Students = new ArrayList<Student>();	// Create Students List
	ArrayList<String> Courses = new ArrayList<String>() {{ // Create Courses List
		add("Science");
		add("English");
		add("Art");
	}};
	
	public School() { // School Constructor
		
	}
	
	public void addTeacher(String name, String surname, String sub) { // Add Teacher Method
		Teachers.add(new Teacher(name, surname, sub)); // Add Teacher to List
	}
	
	public void addStudent(String name, String surname, int year) { // Add Student Method
		Students.add(new Student(name, surname, year)); // Add Students to List
	}
	
	public void showTeachers() { // Show Teachers Method
		for(int i = 0;i < Teachers.size();i++) { // Loop through teachers list
			// Print teacher name and subject
			System.out.println("Name: " + Teachers.get(i).getFirstName() + " " + Teachers.get(i).getLastName() + " " + "Subject: " + Teachers.get(i).getSubject());
		}
	}
	
	public void showStudents() { // Show Students Method
		for(int i = 0;i < Students.size();i++) { // Loop through students list
			// Print student name and grade
			System.out.println("Name: " + Students.get(i).getFirstName() + " " + Students.get(i).getLastName() + " " + "Grade: " + Students.get(i).getGrade());
		}
	}
	
	public void removeTeacher(String name) { // Remove Teacher Method
		Teachers.removeIf(T -> (T.getFirstName() == name)); // Remove teacher from list by first name
	}
	
	public void removeStudent(String name) { // Remove Student Method
		Students.removeIf(S -> (S.getFirstName() == name)); // Remove student from list by first name
	}
	
}
