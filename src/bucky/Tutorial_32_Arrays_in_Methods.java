package bucky;

public class Tutorial_32_Arrays_in_Methods {
	
	public static void main (String[] args){
		
		int bucky[] = {3,4,5,6,7};                                                            // STEP 1
		change(bucky); //Here we take the array bucky and pass it into the method change below.  STEP 2
		
		for(int y: bucky)           //This prints the new values of bucky out on the screen   // STEP 4
			System.out.println(y);

	}

	public static void change (int x []){  //Created a new method named change. Name the type (int) and added [] to tell it your putting in an array  //Step 3 
		
		for (int counter = 0; counter < x.length; counter++)
			x[counter]+=5; //takes all of the indexes in the bucky array and adds 5 to them
		
	}
	
}
//This is how to pass arrays into methods