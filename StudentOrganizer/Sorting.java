package StudentOrganizer;

import java.util.ArrayList;

public class Sorting {


	public static void insertionSort(ArrayList<Float> list) {
	    float key; // Declare a variable to hold the current key value
	    int j; // Declare a variable to keep track of the index while shifting elements
	    
	    // Iterate through the list starting from the second element
	    for (int i = 1; i < list.size(); i++) {
	        key = list.get(i); // Set the current item as the key to be inserted
	        j = i - 1; // Initialize j to the index of the previous item
	        
	        // Iterate backwards to find the correct position for the key element
	        while (j >= 0 && list.get(j) < key) { // Keep moving elements greater than the key to the right
	            list.set(j + 1, list.get(j)); // Shift the item to the right
	            j = j - 1; // Move to the previous index
	        }
	        
	        list.set(j + 1, key); // Place the key element at its correct position
	    }
	    
	}
	
	public static void insertionSortSt(ArrayList<String> list) {
		// PROCESS 
		// start with second item in arraylist
		for (int i = 1; i < list.size(); i++) {
			// set key value as arraylist value of i placement
	        String key = list.get(i);
	        // shifting to other item
	        int j = i - 1;
	        // while  j is greater or equal to 0 AND arraylist item j placement compared to key anothe item in arraylist is greater than 0 
	        while (j >= 0 && list.get(j).compareToIgnoreCase(key) > 0) {
	        	// shift placements 
	            list.set(j + 1, list.get(j));
	            j--;
	        }
	        // shift placements if it is less than 0 
	        list.set(j + 1, key);
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
