
/*
 * Programming a school assignment as requested, commenting is as usual but with some extra spaces and lines for easier reading
 * 'Courses' is just a string ArrayList containing the subjects assigned to the teachers
 * I didn't add comments for getters and setters since you specified not to
 */

public class Main { // Main Class
	
	public static void main(String[] args) { // Main EntryPoint
		
		School KingGeorgeSecondary = new School(); // Create school
		
		//----------Add students and teachers----------
		KingGeorgeSecondary.addStudent("James", "Wong", 8);
		KingGeorgeSecondary.addStudent("Jaden", "Hederian-Sato", 11);
		KingGeorgeSecondary.addStudent("Raul", "Fast", 11);
		KingGeorgeSecondary.addStudent("Daniel", "Wong", 11);
		KingGeorgeSecondary.addStudent("Sachin", "Elam", 11);
		KingGeorgeSecondary.addStudent("Diego", "Bastardo", 11);
		KingGeorgeSecondary.addStudent("Elijah", "Sao", 11);
		KingGeorgeSecondary.addStudent("Constantin", "Paun", 11);
		KingGeorgeSecondary.addStudent("Aure", "Phaneuf", 12);
		KingGeorgeSecondary.addStudent("Max", "Comrie", 9);
		KingGeorgeSecondary.addTeacher("Vicky", "Hughes", "Science");
		KingGeorgeSecondary.addTeacher("Micheal", "Warington", "English");
		KingGeorgeSecondary.addTeacher("Gigi", "Macaz", "Art");
		//----------------------------------------------
		KingGeorgeSecondary.showTeachers(); // List All Teachers
		KingGeorgeSecondary.showStudents();// List All Students
		
		System.out.println("-------------------------"); // Print a dashed line to differentiate between the two lists
		
		//-------Remove Two Students, One Teacher--------
		KingGeorgeSecondary.removeStudent("James");
		KingGeorgeSecondary.removeStudent("Aure");
		KingGeorgeSecondary.removeTeacher("Gigi");
		//------------------------------------------------
		KingGeorgeSecondary.showTeachers(); // List All Teachers
		KingGeorgeSecondary.showStudents(); // List All Students
	}
}
