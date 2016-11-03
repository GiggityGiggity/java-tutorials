package bucky;

import java.util.Scanner;                   //In order to use Scanner we have to import it.  
                                           //Scanner takes what the user types from their keyboard and stores it in a variable.

public class Tutorial_06 {
	public static void main(String arg[]) {
		Scanner bucky = new Scanner (System.in);    //Scanner means we're going to use it. System.in = means whatever is type from the keyboard store it in the variable bucky
		System.out.println(bucky.nextLine());      //nextLine() allows you to wait until you receive input from the code above
	}

}
