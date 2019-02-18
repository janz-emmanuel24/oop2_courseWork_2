package oop2_coursework_2;
/*********************README*********************
 *  created a class oop2_coursework_2 As the Main Class
 *  Author: Jansuk Emmanuel 
 */


public class oop2_coursework_2 {
 
	public static void main(String[] args) {
		java.util.Scanner stuData = new java.util.Scanner(System.in);//main Scanner Object
		String promt = null;
		String stuName = null;
		java.util.ArrayList<String> addedStudents = new java.util.ArrayList<String>();// To hold students Added
		java.util.ArrayList<String> stuCourses = new java.util.ArrayList<String>();//To hold Courses
		java.util.ArrayList<Integer> stuMarks = new java.util.ArrayList<Integer>();//To hold marks
		
		do {//loop starts
			System.out.print("Enter Student name: ");
			stuName = stuData.next();
			addedStudents.add(stuName);
			int stuMark;
			String stuCourse = null;
			for (int i = 0; i <= 5; i++) {
				System.out.print("Enter student course-Name " + (i+1) + ": ");
				stuCourse = stuData.next();
				stuCourses.add(stuCourse); 
				System.out.print("Enter " + stuCourses.get(i) + " marks: ");
				stuMark = stuData.nextInt();
				stuMarks.add(stuMark);
				if (stuMarks.get(i) < 0 || stuMarks.get(i) > 100) {
					stuMarks.remove(i);
					System.out.println("Invalid mark!!!" + '\n' + "Mark is between 0 and 100" + '\n' + "Enter mark Again:");
					stuMark = stuData.nextInt();
					stuMarks.add(i,stuMark);
				}
				
			}
			System.out.println("*********************************************");
			System.out.print('\n');
			int stdTotalMarks = 0;// getting student Total Marks:
			int stdAve = 0;
			int total = 0;
			System.out.println("Student Name:" + addedStudents.get(0));
			System.out.println("Student Course: " + " *** " + "Student Marks: ");
			for (int j = 0; j <= 5; j++) {
				stdTotalMarks += stuMarks.get(j);
				total = stdTotalMarks;
				stdAve = total / 6;
				System.out.println(stuCourses.get(j) + "                   " + stuMarks.get(j));
			}
			System.out.println("**********************************************");
			System.out.println("Total Marks: " + total);
			System.out.println("Student Average Marks: " + stdAve);
			System.out.println("**********************************************");
			System.out.println("Enter another student: yes / no");
			promt = stuData.next();
			System.out.println("***********************************************");
			System.out.print('\n');
			
			if (promt.toLowerCase().equals("no")) {
				break;
			} else if (promt.toLowerCase().equals("yes")) {
				stuName = null;
				addedStudents.clear();
				stuCourses.clear();
				stuMarks.clear();
			}
			
		} while(promt.toLowerCase().equals("yes"));//loop ends
	
	}
 		 			 
}