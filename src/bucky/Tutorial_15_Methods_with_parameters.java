package bucky;

import java.util.Scanner;                                       //you imported Scanner so we can type in a response with the keyboard

public class Tutorial_15_Methods_with_parameters {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);              //we stored the keyboard value (bucky roberts) "System.in" into the var input
		
		Tuna_T15 tunaObject = new Tuna_T15 ();            //We created a Object so we can use the Tuna_T15.java class
		
		System.out.println("Enter your name here: ");        //This puts the prompt on the screen
		
		String name = input.nextLine();                    //We want this to be equal to anything we type in so it displays whatever they typed in
		
		tunaObject.simpleMessage(name);    //Next we said in the class Tuna_T15 use the method called simpleMessage that takes an argument () of name (String name) and do what that method say to do
	
		
	}
}
