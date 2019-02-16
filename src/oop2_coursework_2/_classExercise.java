package oop2_coursework_2;

public class _classExercise {

	public static void main(String[] args) {
		System.out.print("Enter Students' names: (Enter exit when done)\n");
		java.util.ArrayList<String> _stuNames = new java.util.ArrayList <String>();
		int i = 0;
		int n = 0;
		while (i <= _stuNames.size()) {// Loop until exit is entered
			n = i + 1;
			System.out.print("Enter Student name " + n + ": ");
			java.util.Scanner nameInput = new java.util.Scanner(System.in);
			String _stuName = nameInput.nextLine();
			if (_stuName.toLowerCase().equals("exit")) {//To break when the word exit is entered
				break;
			} else
				_stuNames.add(_stuName);
			i++;
		}
		System.out.println("*****************************************");
		System.out.print("Items in the ArrayList Include: ");
		System.out.println(_stuNames);
	
	}

}
