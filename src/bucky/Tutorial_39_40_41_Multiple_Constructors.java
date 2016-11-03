package bucky;

public class Tutorial_39_40_41_Multiple_Constructors {
	public static void main(String[] args) {
		
		T39_40_41 T39_40_41Object = new T39_40_41(); //This Object has 0 parameter and is going to look in T39_40_41 for a constructor with 0 parameters 
		T39_40_41 T39_40_41Object2 = new T39_40_41(5); //This Object has 1 parameter (5) and is going to look in T39_40_41 for a constructor with 1 parameters
		T39_40_41 T39_40_41Object3 = new T39_40_41(5,13); //This Object has 2 parameters (5, 13) and is going to look in T39_40_41 for a constructor with 2 parameters
		T39_40_41 T39_40_41Object4 = new T39_40_41(5,13,43); //This Object has 3 parameters (5, 13, 43) and is going to look in T39_40_41 for a constructor with 3 parameters
		
		System.out.printf("%s\n", T39_40_41Object.toMilitary()); //This is going to print out a string(%s) with a new line(/n) and its going to return the T39_40_41 constructor with no arguments  
		System.out.printf("%s\n", T39_40_41Object2.toMilitary()); //going to return the T39_40_41 constructor with 1 argument
		System.out.printf("%s\n", T39_40_41Object3.toMilitary()); //going to return the T39_40_41 constructor with 2 argument
		System.out.printf("%s\n", T39_40_41Object4.toMilitary()); //going to return the T39_40_41 constructor with 3 argument
		
	}
	
}



// This tutorial covers Multiple Constructors, Set and Get methods and Building objects for constructors 
// Over loaded constructors and how they are useful when creating objects with different argument lengths 