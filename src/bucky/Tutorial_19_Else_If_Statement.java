package bucky;

public class Tutorial_19_Else_If_Statement {

	public static void main(String[] args) {
		int age = 45;
		
		if (age >= 60)
			System.out.println("You are a senior citizen");
		else if (age >=50)
			System.out.println("You are in your 50s");
		else if (age >=40)                               //You can have multiple else if's
			System.out.println("You are in your 40s");
		else                                             //Notice you don't have parameters after the else () because this is the end
			System.out.println("You are a young buck");
		
	}
}



// else if = a way to give many options