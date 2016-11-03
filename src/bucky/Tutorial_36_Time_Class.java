package bucky;

public class Tutorial_36_Time_Class {
	
	public static void main (String[] args){
		
		T36 T36Object = new T36();
		System.out.println(T36Object.toMilitary());
		T36Object.setTime (13, 27, 6); // This is the time that was entered we set it to the class T36 in the method setTime
		System.out.println(T36Object.toMilitary());
	}

}
//This is going to allow a user to enter second, minute, hour and convert it into regular time and military time.