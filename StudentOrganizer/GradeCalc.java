package StudentOrganizer;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeCalc {
	 Scanner scanner = new Scanner(System.in);
	 Scanner scanner2 = new Scanner(System.in);
	 Scanner scanner3 = new Scanner(System.in);


	public static void average(ArrayList<Float> grades) {
		
		// PROCESS 
		// stating  values 
		float average= 0 ;
		float totalSum = 0;
// going through each value in grades and adding them together 
		for (int i = 0; i < grades.size() - 1; i++) {
		    float sum = grades.get(i) + grades.get(i + 1);
		    totalSum += sum;
		}
		// dividing both by the amount of values the user has to get average 
		average= totalSum/ grades.size() ;
		// print out average 
		//OUTPUT
		System.out.println("Your Average is: " + average);
 	}
	
	
	
	public void finalGradeCalc() {
		float currentGrade= 0 ;
		float wantedGrade =0 ;
		float examWorth =0;
		float gradeNeeded= 0;
	// INPUT IS THE USER INSERTION from the scanners 
		System.out.println("Current Grade : ");
	currentGrade = scanner.nextFloat();
		System.out.println("Wanted Grade: ");
		wantedGrade = scanner2.nextFloat();
		System.out.println("Final exam worth %" );
		examWorth = scanner3.nextFloat();
		//PROCESS taking these values to calcuate the grade user needs to get desired grade
		gradeNeeded =( (wantedGrade-(100 - examWorth)*currentGrade)/ examWorth);
		//OUTPUT print statement
		System.out.println("you must get a " + gradeNeeded + "% to earn a " + wantedGrade) ;
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {

	}

}
