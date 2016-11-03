package bucky;

public class Tutorial_24_Do_While_Loops {

	public static void main(String[] args){
		
		int counter = 15;
		
		do{
			System.out.println(counter);
			counter++;
		}while(counter <= 10);
		
	}
	
}

/* Any time you want to run through the loop AT LEAST ONCE you use a Do While Loop (Guarantees at least 1 run through the loop).
 * 
 * Any time you want to test it first and only run it if the test is true thats when you use a While Loop
 * 
*/