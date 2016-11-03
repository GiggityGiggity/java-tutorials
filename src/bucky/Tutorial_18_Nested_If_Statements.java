package bucky;

public class Tutorial_18_Nested_If_Statements {
	public static void main(String[] args){
		int age = 60;
		
		if (age < 50){
			System.out.println("You are young");
		}else{
			System.out.println("You are old");
			if (age > 75){                                                 //This is where the nesting started. You can start in the if too
				System.out.println("You are really old");
			}else{
				System.out.println("Dont worry you really arent that old");
			}
		}
	}

}


// Nesting is if you have an if else inside another if statement