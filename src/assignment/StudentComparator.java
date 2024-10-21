// MarksComparator.java
package assignment;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
	
	public int compare(Student s1, Student s2) {
		// Compare students by their marks 
		return Double.compare(s1.getMarks(), s2.getMarks());
	}
}
