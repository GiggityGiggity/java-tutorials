package bucky;

/* A Switch statement tests 1 var and depending on the value it gives you multiple choices.  
 * It finds the var within the parameters
 * Switch statements are used so you don't have to write multiple if statements.
 */

public class Tutorial_12_SwitchStatement {
	public static void main(String args[]){
		
		int age;
	    age = 3;                                       //this is the var value we want to find
	    
	    switch (age){                                  //Switch finds the var value within the parameters below (cases)
	    case 1:                                        //Is this case value your looking for? you have to use a colon on this:
	    	System.out.println("You can crawl");       //If so println this
	    	break;                                     //Stop here if everything above is true otherwise continue
	    case 2:
	    	System.out.println("You can talk");
	    	break;
	    case 3:
	    	System.out.println("You can get in trouble");
	    	break;
	    default:                                        //If none of the cases work print the message below
	    	System.out.println("I dont know how old you are");
	    	break;
	    }
	}
}
