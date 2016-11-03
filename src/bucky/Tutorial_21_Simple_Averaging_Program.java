package bucky;

import java.util.Scanner;

public class Tutorial_21_Simple_Averaging_Program {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);   //using the keyboard to store a value in input
		int total = 0;    //holds the sum of all the grades
		int grade;        //allows you to import numbers individually 
		int average;      //is used later to average all the numbers together
		int counter = 0;  //counter var for the while loop
		
		while (counter < 10) {  //allows you to add up to 10 grades
			grade = input.nextInt();   //what was entered in the keyboard will be stored in grade temporarily for each loop
			total = total + grade;   // total keeps a running taly for all the grades you entered (so total = total plus the new number)
			counter++;
		}
		
		average = total/10;  //does the math for your average 
		System.out.println("Your average is " + average);
		
	}

}


//This program allows you to enter 10 different numbers and gives you the sum. 