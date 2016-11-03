package bucky;

import java.util.Scanner;

public class Apples_T16 {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);         //You have to import import java.util.Scanner to use this
		
		Tutorial_16_ManyMethods_and_Instances tunaObject = new Tutorial_16_ManyMethods_and_Instances();
		
		System.out.println("Enter name of first gf here: ");  //This is just the prompt
		
		String temp = input.nextLine();   //whatever the user types in will be store in the var temp
		
		tunaObject.setName(temp);  //In your class Tutorial_16_ManyMethods_and_Instances takes this var temp and use it in the setName method (line 6&7 name)
		
		tunaObject.saying();  //This is going to display the method saying line 12 in Tutorial_16_ManyMethods_and_Instances
	}

}

//
//
//
//THIS TUTORIAL IS BACKSWARDS COMPARED TO THE T15 & T14 IN THE WAY IT CALLS THE CLASSES BECAUSE THE GUY ON YOUTUBE IS DUMB
//
//
//