package bucky;

public class Tutorial_38_Public_Private_and_This {
	
	public static void main (String[] args){
	
	// Lines 8-10 will just output the default time of T37		
			T38 T38Object = new T38();
			System.out.println(T38Object.toMilitary());
			System.out.println(T38Object.toString());
	// lines 8,9,10 will output the defaults to the screen 00:00:00 and 12:00:00 AM

	// Line 13-15 will out 13 as the h 27 as the m and 6 as the s		
			T38Object.setTime (13, 27, 6); // This is the time that was entered we set it to the class T37 in the method setTime
			System.out.println(T38Object.toMilitary());
			System.out.println(T38Object.toString());
			
			
			
		}

	}
//This tutorial goes over the Public, Private and This keywords
// Anytime you want to use the variables in your method instead of the variables outside of your method you need to use the "this" keyword
