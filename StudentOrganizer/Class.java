package StudentOrganizer;


public class Class {
	 private String materialName;
	 //ALL PROCESS

	 	// Constructor  // all materials have names
	 	public Class(String name) {
	 	
	 		this.materialName = name;
	 	}
	 
		public static void main(String[] args) {
			Class classname = new Class("hi");
			
		}
		public String toString() {
			// prints variable as itemName
			return this.materialName	;
		}

	}
