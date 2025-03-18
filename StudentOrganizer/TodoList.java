package StudentOrganizer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;
public class TodoList {
private ArrayList<String> list = new ArrayList<String>();
private ArrayList<Integer> worth = new ArrayList<Integer>();
private ArrayList<Integer> unsortedWorth = worth;
private ArrayList<String> Dlist = new ArrayList<String>();
Scanner scanner = new Scanner(System.in);

	
	public void itemAdd(String item) {
	//PROCESS 
		// adding item to list arraylist
	list.add(item);
	System.out.println("Added successfully ");

	}
	public void importance() {
	// 
		int number = 0;
		System.out.println("in a scale of 1-10 how important is this task ?");
		number = scanner.nextInt();
		worth.add(number);
		
	}
	public void viewList() {

		
	insertionSortInt(worth);
	 for (int i = 1 ; i < worth.size() ; i ++) {
		    // OUTPUT PRINTING NEW SORTED DIFFICULTYLIST ARRAYLIST WITH CORRESPONDING NAME 
		    	// Print the element in 'names' list at the position of the corresponding item in 'difficultyListUnsorted' plus 1 ignoring first item 
		    	System.out.print(list.get(unsortedWorth.indexOf(worth.get(i)) + 1));
		    	// Print a separator "||" followed by the corresponding item from 'difficultyList'
		    	
		    	
		    }
	
	
		
	}
	
	
	
	
	public static void insertionSortInt( ArrayList<Integer> list ) {
		//PROCESS 
		int key;
		int j;
	// starts at second item then continues until end of arralist 
		for (int i =1; i<list.size(); i++) {
			// key is arraylist item i placement
			key= list.get(i);
			j= i-1;
			// while j is greater than equal to 0 AND arraylist item is greater than key that is anothe item in arraylist 
			while(j>=0 && list.get(j) < key) {
				// set order 
				list.set(j+ 1 , list.get(j) );
				j = j-1;
			}
			// set order if key is less then list.get(j)
			list.set(j + 1, key);
		}
	}
		
	public void removeTask(int index) {
		list.remove(index);
		
	}
	
	
	public static void main(String[] args) {

		
		
		
		
	}
}
