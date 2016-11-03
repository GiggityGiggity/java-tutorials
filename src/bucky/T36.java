package bucky;

public class T36 {

	private int hour;
	private int minute;
	private int second;
	
	public void setTime(int h, int m, int s){ //This is where we passed our #'s from the Tutorial_36 class in [T36Object.setTime (13, 27, 6);]
		hour = ((h>=0 && h<24) ? h : 0);  // If the h (hour is greater then 0 and less then 24 ?(means confirm this) : (if not) say 0
		minute = ((m>=0 && m<60) ? m : 0);
		second = ((h>=0 && s<60) ? s : 0);
		
	}
	
	public String toMilitary(){
		return String.format("%02d:%02d:%02d", hour, minute, second); // "%02d:%02d:%02d" is going to display the first one at 2 decimal place and a colon and the same for the rest
	}
	
}
