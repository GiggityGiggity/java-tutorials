package bucky;

public class Tutorial_37_Display_Regular_Time {
	
	public static void main (String[] args){
		
// Lines 8-10 will just output the default time of T37		
		T37 T37Object = new T37();
		System.out.println(T37Object.toMilitary());
		System.out.println(T37Object.toString());
// lines 8,9,10 will output the defaults to the screen 00:00:00 and 12:00:00 AM

// Line 13-15 will out 13 as the h 27 as the m and 6 as the s		
		T37Object.setTime (13, 27, 6); // This is the time that was entered we set it to the class T37 in the method setTime
		System.out.println(T37Object.toMilitary());
		System.out.println(T37Object.toString());
		
		
		
	}

}
//This is going to allow a user to enter second, minute, hour and convert it into regular time and military time.