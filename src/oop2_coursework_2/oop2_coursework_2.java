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
		
		for (int i = 0; i <= stuNames.size(); i++) { //Start of the first loop
			if (stuNames.size() == 6) {
				break;
			} else 
				System.out.println("Enter Student Name: ");
				stuName = _insert.nextLine();
				stuNames.add(stuName); //End of first Loop
				
		}
		
		System.out.println("Enter Student course: ");
		stuCourse = _insert.nextLine();
		System.out.println("Enter Studen Course mark: ");
		stuMark = _insert.nextInt();
		

	}

}
