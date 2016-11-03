package bucky;

public class T38 {
// The below vars are instance/local variables	
	private int hour =1;
	private int minute =2;
	private int second = 3;
	
	public void setTime(int hour, int minute, int second){ //This is where we passed our #'s from the Tutorial_38 class in [T38Object.setTime (13, 27, 6);]
// The below vars are method variables 		
		this.hour = 4;                 //by adding "this" it allows us to use the method vars and not the instance/local vars
		this.minute = 5;
		this.second = 6;
	}
	
	public String toMilitary(){
		return String.format("%02d:%02d:%02d" , hour, minute, second); // "%02d:%02d:%02d" is going to display the first one at 2 decimal place and a colon and the same for the rest
	}
	
	public String toString(){
		return String.format("%d:%02d:%02d %s", ((hour==0 || hour==12)?12:hour%12), minute, second, (hour < 12? "AM":"PM"));
//	%d = hour %02d = minute because it always has 2 decimal places %02d same for second and %s = AM or PM since its a string
// We need to check if the hour is 0 or 12 if it is put 12 (?12) else(:) take the modulus of 12(hour%12)
	}
	
}

//Private = only the methods in the same class have access to them (if you try to access the variable outside of the class you get a not visible error)
//Method and Constructor are the same thing