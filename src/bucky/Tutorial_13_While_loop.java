package bucky;

/*While loop allows you to execute a certain block of code multiple times but only write it one time.
 * 
 */

public class Tutorial_13_While_loop {
	public static void main(String args[]){
		
		int counter = 0;                         //This is the begining value of the counter 0
		
		while (counter < 10) {                   //the condition () is going to determine how many times the {} is ran
			System.out.println(counter);         //whatever is in the {} is going to be executed until the condition is met
			counter++;                           //This increases the counter by 1 otherwise it would run forever
		}
	}
}
