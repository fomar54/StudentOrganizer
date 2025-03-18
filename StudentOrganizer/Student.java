package StudentOrganizer;
import java.util.ArrayList;
import java.util.Scanner;

import Inventoryproject.Materials;
public class Student {
	//private ArrayList<> 
	private ArrayList<Class> classes = new ArrayList<Class>();
	private ArrayList<Float> grades = new ArrayList<Float> ();
	public Scanner markIput = new Scanner(System.in);
	
	
	
	public void addClasses(Class classname ) {
		// add an material  to arraylist
		this.classes.add(classname);	
	}

	
	public void addGrade( Float mark) {
		// add material 
		this.grades.add(mark);
	}
	
	public ArrayList viewGrades() {
		// return back values 
		
		return grades;
		
	}
	
	
	
	public void view() {
		// return back values 
		 for (int i = 1 ; i < grades.size() ; i ++) {
			    // OUTPUT PRINTING NEW SORTED DIFFICULTYLIST ARRAYLIST WITH CORRESPONDING NAME 
			    	// Print the element in 'names' list at the position of the corresponding item in 'difficultyListUnsorted' plus 1 ignoring first item 
			    	System.out.print(classes.get(i) +":" + grades.get(i));
			    	// Print a separator "||" followed by the corresponding item from 'difficultyList'
			    	
			    	
			    }
		
		
	}
	
	
	public static void main(String[] args) {

	}

	
	
	
	
	
}
