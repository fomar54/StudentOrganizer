package StudentOrganizer;
import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyPlanner {
    public int limitValue; // Variable to store the limit of events for the week
    private ArrayList<String> events = new ArrayList<String>(); // ArrayList to store events
    Scanner scanner = new Scanner(System.in); // Scanner object for user input

    /**
     * Displays all events currently in the planner.
     * Output: Prints each event with its index to the console.
     */
    public void viewPlanner() {
        System.out.println("Tasks");
        for (int i = 0; i < events.size(); i++) {
            System.out.println("Event " + i + ": " + events.get(i));
        }
    }
public int  eventArraylist() {
	// getter 
	
	return events.size();
}
    /**
     * Prompts the user to input the maximum number of events they want to limit for the week.
     * Input: User input (integer) specifying the limit of events.
     * Process: Stores the user input in the 'limitValue' variable.
     * Output: None (updates 'limitValue' instance variable).
     */
    public void limt() {
        System.out.println("How many events would you like to limit this week?");
        limitValue = scanner.nextInt();
    }

    /**
     * Adds a new event to the planner.
     * Input: Event description (String) to be added.
     * Process: Adds the event to the 'events' ArrayList.
     * Output: None (modifies 'events' ArrayList).
     * 
     */
    public void addPlanner(String event) {
        events.add(event);
    }

    /**
     * Removes an event from the planner based on its index.
     * Input: Index (integer) of the event to be removed.
     * Process: Removes the event from the 'events' ArrayList at the specified index.
     * Output: None (modifies 'events' ArrayList).
     * 
     */
    public void removePlanner(int index) {
        events.remove(index);
    }
    
}
