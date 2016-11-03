package bucky;

//This exercise is using the Tuna.java class
//public means anything can use it. void means its going to do something but not return any data

public class Tutorial_14_Using_Multiple_Classes {
	public static void main(String[] args) {            //main function or method
		
/* Whenever you want to use a Method from another class in this instance we are using a Method from the Tuna.java class called simpleMessage
 * 1st have to put the class name (Tuna)
 * 2nd you need an Object name (tunaObject) what this Object allows you to do is use something from the Tuna.java class
 * 3rd you set the Object equal to something ( = new tuna();)
 * 4th you use the Object name (tunaObject) followed by the dot separator and the method you want to use from the other class
 * (simpleMessage) is the method from the Tuna.java class.  
 */
		Tuna tunaObject = new Tuna();    //Tuna and new Tuna are case sensitive. It has to be a capital T because the class has a capital T
		tunaObject.simpleMessage();
		
	}
}

// This is a great way for a boss to break up a project.  He can assign Tim to create a class, Mary to create a class and the head programmer can group them all together for a program.

