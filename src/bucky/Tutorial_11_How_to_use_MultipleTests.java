package bucky;

public class Tutorial_11_How_to_use_MultipleTests {
	public static void main(String args[]){
		
		int boy, girl;
		boy = 18;
		girl = 68;
		
		//if (boy > 10){                              //this is the standard way to run 1 test
		//if (boy > 10 && girl < 60){                 //Using the && you can test multiple things but they both have to be true
		if (boy > 10 || girl < 60){                   //Using the || one or the other has to be true
			System.out.println("You can enter");
		}else{
			System.out.println("You cant enter");
		}
	}
}
