package bucky;

import java.util.Random;  //You have to import random for the random generator

public class Tutorial_26_Random_Number_Generator {
	public static void main(String[] args) {
		
		Random dice = new Random();
		int number;
		
		for(int counter=1; counter<=10; counter++) {
//			number = dice.nextInt(6);  //if you do it this way it will start counting from 0 not 1.  (6) is your range this is what it will go to
			number = 1+dice.nextInt(6);  //This way 1+ will start counting from 1
			System.out.println(number + " ");
		}
		
	}

}
