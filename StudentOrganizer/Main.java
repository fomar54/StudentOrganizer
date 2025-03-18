package StudentOrganizer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    String name;
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    Scanner scanner3 = new Scanner(System.in);
    Scanner scanner4 = new Scanner(System.in);
    Scanner scanner7 = new Scanner(System.in);
    Scanner scanner8 = new Scanner(System.in);
    Scanner scanner9 = new Scanner(System.in);
    Scanner scanner10 = new Scanner(System.in);
    Scanner scanner11 = new Scanner(System.in);
    private Student student = new Student(); // Instance of Student class
    private GradeCalc calc = new GradeCalc(); // Instance of GradeCalc class (assumed)
    private WeeklyPlanner planner = new WeeklyPlanner(); // Instance of WeeklyPlanner class
    private TodoList list = new TodoList(); // Instance of TodoList class
    private Sorting sort = new Sorting(); // Instance of Sorting class (assumed)
    public String GREEN = "\u001B[32m ";
    public String RESET = "\u001B[0m";

    /**
     * Welcomes the user and introduces them to the personal student organizer.
     * Input: User's name entered via scanner.
     * Process: Displays welcome messages and initializes necessary components.
     * Output: None (prints messages to console).
     */
    private void intro() {
        System.out.println("Welcome to your own personal student organizer.");
        System.out.println("What is your name? ");
        name = scanner1.nextLine();
        System.out.println("Introducing " + name + " to your own personal to-do list, grade calculator, and weekly planner.");
        System.out.println("First, you must input all your classes and grades (enter any key to continue).");
        scanner2.next();
    }

    /**
     * Manages the process of adding classes and grades to the student object.
     * Input: User input for class names and grades.
     * Process: Uses Student methods to add classes and grades, handles user decisions.
     * Output: None (prints messages to console).
     */
    public void addCenter() {
        String className;
        float grade;
        String choice;
        int input;
        String choice2;
        boolean adding = true;

        while (adding) {
            while (true) {
                System.out.println("Name of class: ");
                className = scanner3.nextLine();
                System.out.println("Add " + className + " to classes? (yes or no)");
                choice = scanner4.nextLine().toUpperCase();

                if (choice.equals("YES")) {
                    student.addClasses(new Class(className)); // Assuming student.addClasses(Class) adds a class
                    System.out.println("Class added.");
                    break; // Exit the class adding loop
                } else if (choice.equals("NO")) {
                    System.out.println("[1] Add new class or [2] menu");
                    input = intVaildtor();
                    if (input == 1) {
                        // Continue loop to add a new class
                    } else if (input == 2) {
                        menu(); // Go back to menu
                        adding = false;
                        break; // Exit the adding loop
                    } else {
                        System.out.println("Invalid input.");
                    }
                } else {
                    System.out.println("Incorrect input.");
                }
            }

            while (true) {
                System.out.println("Insert Grade (only number, no %): ");
                grade = scanner8.nextFloat();
                scanner8.nextLine(); // Consume newline
                System.out.println("Add " + grade + " to grades? (yes or no)");
                choice = scanner4.nextLine().toUpperCase();

                if (choice.equals("YES")) {
                    student.addGrade(grade); // Assuming student.addGrade(float) adds a grade
                    System.out.println("Grade added.");
                    break; // Exit the grade adding loop
                } else if (choice.equals("NO")) {
                    System.out.println("[1] Add new grade or [2] menu");
                    input = intVaildtor();
                    if (input == 1) {
                        // Continue loop to add a new grade
                    } else if (input == 2) {
                        menu(); // Go back to menu
                        adding = false;
                        break; // Exit the adding loop
                    } else {
                        System.out.println("Invalid input.");
                    }
                } else {
                    System.out.println("Incorrect input.");
                }
            }

            System.out.print("Done adding grades and classes? (yes or no): ");
            choice2 = scanner9.nextLine().toUpperCase();
            if (choice2.equals("YES")) {
                adding = false;
                System.out.println("Sending to menu.");
                menu();
            } else if (choice2.equals("NO")) {
                System.out.println("Looping back.");
            } else {
                System.out.println("Invalid input.");
            }
        }
    }

    /**
     * Displays a menu to the user and allows them to navigate between different functionalities.
     * Input: User's choice of menu option.
     * Process: Uses switch-case to call corresponding methods based on user input.
     * Output: None (prints messages to console and calls methods).
     */
    public void menu() {
        int choice;
        while (true) {
            System.out.println("Where do you want to go?");
           
            System.out.println("[1] Todo list");
            System.out.println("[2] Weekly Planner");
            System.out.println("[3] grade calculator");

            choice = intVaildtor(); // Assuming intVaildtor() validates user input
            if (choice == 1 || choice == 2|| choice == 3 ) {
               
                  if (choice == 1) {
                    toDoList();
                } else if (choice == 2) {
                    planner();
                }
                else if (choice == 3) {
                	gradeCalc();
                }
                break; // Exit loop after calling method
            } else {
                System.out.println("Invalid Input. Please enter 1, 2, or 3.");
            }
        }
    }

    /**
     * Displays sorted classes and corresponding grades.
     * Input: None (uses Student methods to get classes and grades).
     * Process: Uses Sorting class to sort classes, retrieves grades, and prints sorted output.
     * Output: Prints sorted classes and corresponding grades to console.
     */
   
    private void toDoList() {
        int choice;
        String task;
        int choice2;
        int choice3;
        boolean startAgain = true;
        while (startAgain) {
            while (true) {
                System.out.println("Welcome to " + name + "'s personal to-do list.");
                System.out.println("[1] View tasks");
                System.out.println("[2] Add new task");
                System.out.println("[3] Remove task");
                System.out.println("[4] Return to menu");
                choice = intVaildtor();
                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    break;
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            }

            if (choice == 1) {
                list.viewList(); // Assuming viewList() displays the tasks in the list
            } else if (choice == 2) {
                while (true) {
                    System.out.println("What task would you like to add?");
                    task = scanner7.nextLine();
                    list.importance(); // Assuming importance() prompts for task importance
                    list.itemAdd(task); // Assuming itemAdd(String) adds a task to the list
                    System.out.println("Stop adding tasks or continue? [1] Continue [2] Stop adding");
                    choice2 = intVaildtor();
                    if (choice2 == 2) {
                        break;
                    }
                }
                System.out.println("New to-do list:");
                list.viewList(); // Display updated list after adding tasks
            } else if (choice == 3) {
                list.viewList(); // Display current tasks before removal
                System.out.println("Enter the index number of the task you would like to remove:");
                choice3 = intVaildtor();
                list.removeTask(choice3); // Assuming removeTask(int) removes a task
            } else if (choice == 4) {
                startAgain = false;
                menu(); // Return to main menu
            }
        }
    }

    /**
     * Manages the weekly planner functionality.
     * Input: User input for viewing, adding, and removing events.
     * Process: Uses WeeklyPlanner class methods to display, add, and remove events.
     * Output: None (prints messages to console and calls methods).
     */
    private void gradeCalc() {
    	int choice ;
    	// input is user scanner input 
    	// processing is calc method  using that
    	// output is statments and menu 
    	while (true) {
    	System.out.println("welcome " + name +"to your own presonal grade calculator here you can \n [1] see your average [2] caclulate final mark [3] see all grades   ");
    	choice = intVaildtor();
    	if (choice == 1|| choice ==  2 || choice == 3 ) {
    		
    		if (choice == 1) {
    			// PROCESS 
  calc.average(student.viewGrades());
  menu();
    	break;	
    		
    		} 
    		if  (choice == 2 ) {
    			//PROCESS 
    			
    			calc.finalGradeCalc();
    			menu();
    		break;
    			
    		
    		
    		
    	} if (choice == 3) {
    		student.view();
    
    	}
			break;
    		
		} 
    		else {
    		System.out.println("invaild input , enter 1 or 2 ");
    	}
    	
    }
   }
    private void planner() {
        int choice;
        String event;
        int eventR;
        int limit = planner.limitValue;
        int amount = planner.eventArraylist();
        System.out.println("Welcome to your personal planner.");
        planner.limt();
        System.out.println("[1] View planner");

        System.out.println("[2] Add event to planner");
        System.out.println("[3] Remove event from planner");
        choice = intVaildtor();
        if (choice == 1 || choice == 2 || choice == 3) {
            if (choice == 1) {
                planner.viewPlanner(); // Assuming viewPlanner() displays the planner
            } else if (choice == 2) {
            	
            	if (limit < amount) {
            		 System.out.println("What event would you like to add?");
                     
                     event = scanner10.nextLine();
                     planner.addPlanner(event); // Assuming addPlanner(String) adds an event
            	}
            	
            	if (limit > amount) {
           		System.out.println("Planner is filled with too many events");
           		
           	}
               
            } else if (choice == 3) {
                System.out.println("Enter the index of the event you would like to remove:");
                planner.viewPlanner(); // Display current events before removal
                eventR = scanner11.nextInt();
                planner.removePlanner(eventR); // Assuming removePlanner(int) removes an event
                planner.viewPlanner(); // Display updated planner after removal
            }
        }
    }

    /**
     * Validates user input as an integer.
     * Input: User input via scanner.
     * Process: Checks if input is an integer.
     * Output: Returns the validated integer input.
     *
     */
    public static int intVaildtor() {
        Scanner input = new Scanner(System.in);
        boolean numberEntered = false;

        while (!numberEntered) {
            System.out.println("Enter option selected:");
            if (input.hasNextInt()) {
                numberEntered = true;
            } else {
                System.out.println("Invalid input. Enter a number.");
                input.nextLine(); // Consume invalid input
            }
        }
        int num = input.nextInt();
        return num;
    }

    /**
     * Main method to start the program.
     * Input: None (runs initialization and user interaction methods).
     * Process: Calls intro(), addCenter(), and manages main menu navigation.
     * Output: None (prints messages and interacts with user via console).
     *
     */
    public static void main(String[] args) {
        Main organizer = new Main();
        organizer.intro(); // Welcomes the user and initializes the organizer
        organizer.addCenter(); // Manages adding classes and grades
        // Further navigation is handled through the menu method internally
    }
}

