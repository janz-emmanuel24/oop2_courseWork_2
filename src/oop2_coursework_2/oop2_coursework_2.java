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
		int stuMark, toMark = 0, aveMark = 0;
		
		Scanner _insert = new Scanner(System.in);// Scanner variable
		int i = 0;
		while ( i <= stuNames.size()) { //Start of the first loop
			if (stuNames.size() == 6) {
				break;
			} else 
				System.out.println("Enter Student Name: ");
				stuName = _insert.next();
				stuNames.add(stuName); //End of first Loop
				
				for (int k = 0; k <= stuCourses.size(); k++) { //Second Loop
					if (stuCourses.size() == stuNames.size()) {
						break;
					} else 
						System.out.println("Enter Student course: ");
						stuCourse = _insert.next();
						stuCourses.add(stuCourse);
						for (int j = 0; j <= stuMarks.size(); j++) { //third Loop
							if (stuMarks.size() == stuCourses.size()) {
								break;
							} else
								System.out.println("Enter Student Course mark: ");
								stuMark = _insert.nextInt();
								if (stuMark < 0 || stuMark > 100) {
									System.out.println("Invalid mark!!!" + '\n' + "Mark is between 0 and 100" + '\n' + "Enter mark Again:");
									stuMark = _insert.nextInt();
								} else
								stuMarks.add(stuMark);
						} //third loop ends
				} //end of second loop
				
				i++;
		}
		System.out.println(stuNames);
		System.out.println(stuCourses);
		System.out.println(stuMarks);
		//looping through the marks to get total
		for (int m = 0; m <= stuMarks.size()-1; m++) {
			toMark += stuMarks.get(m);
			//System.out.println(toMark);
		}
		aveMark = toMark / stuMarks.size();
		System.out.println(aveMark);
	}

}
