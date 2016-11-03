package bucky;

import java.util.Scanner;                                   //Imported scanner

public class Tutorial_07 {
	public static void main(String args[]) {
		Scanner bucky = new Scanner(System.in);             //Here we create a var (bucky) so we can use the scanner
		double fnum, snum, answer;                          //Here we have an array of vars
		System.out.println("Enter first num: ");            //We println to ask Enter first num
		fnum = bucky.nextDouble();                                //This is the keyboard input. nextDouble = Double means number
		System.out.println("Enter second num: ");           //We println to ask Enter second num
		snum = bucky.nextDouble();                                //This is the keyboard input. nextDouble = Double means number
		answer = fnum + snum;                               //This is where we add everything
		System.out.println(answer);                         //This is how you display the results
	}

}
