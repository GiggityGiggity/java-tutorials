package bucky;

import java.util.Scanner;

public class Tutorial_09_assignment_and_increment_opperators {
	public static void main (String args[]){
		Scanner bucky = new Scanner (System.in);
		
		int tuna = 5;
		int bass = 18;
		//++tuna;                                       using the increment variable we add 1 to tuna
		//System.out.println(tuna);
		
		//System.out.println(++tuna);                    //you can also add the increment var right into the println method
		//Pre-incrementing changes the value of the var before it uses it
		
		System.out.println(tuna++);  //Post-incrementing will first use the var (in this case 5) and print that out.
		System.out.println(tuna);	//When you ask to print the var again it will add 1
		// You can also use subtraction for ex; System.out.println(tuna--) or System.out.println(--tuna)
		
		
		//Ways to add increments to vars
		bass = bass + 5;
		System.out.println(bass);
		//or you can do it this way too its the same result just a different way to do it
		bass += 5;                       //This is called the assignment operator    
		System.out.println(bass);
		//You can also use subtraction, multiplication and division for ex: bass -= 5; or bass *= 5;
	}

}
