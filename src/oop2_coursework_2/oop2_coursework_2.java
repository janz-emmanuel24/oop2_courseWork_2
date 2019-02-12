package oop2_coursework_2;
import java.util.*;

public class oop2_coursework_2 {

	public static void main(String[] args) {
		//Creating Array lists to hold the marks, names and courses
		ArrayList<String> stuNames = new ArrayList<String>();
		ArrayList<String> stuCourses = new ArrayList<String>();
		ArrayList<Integer> stuMarks = new ArrayList<Integer>();
		//Creating variables
		String stuName, stuCourse;
		int stuMark;
		
		Scanner _insert = new Scanner(System.in);// Scanner variable
		
		for (int i = 0; i <= stuNames.size();) { //Start of the first loop
			if (stuNames.size() == 6) {
				break;
			} else 
				System.out.println("Enter Student Name: ");
				stuName = _insert.nextLine();
				stuNames.add(stuName); //End of first Loop
				
				for (int k = 0; k <= stuCourses.size(); k++) { //Second Loop
					if (stuCourses.size() == stuNames.size()) {
						break;
					} else 
						System.out.println("Enter Student course: ");
						stuCourse = _insert.nextLine();
						stuCourses.add(stuCourse);
						for (int j = 0; j <= stuMarks.size(); j++) { //third Loop
							if (stuMarks.size() == stuCourses.size()) {
								break;
							} else
								System.out.println("Enter Student Course mark: ");
								stuMark = _insert.nextInt();
								stuMarks.add(stuMark);
						} //third loop ends
				} //end of second loop
				
				i++;
		}
	}

}
