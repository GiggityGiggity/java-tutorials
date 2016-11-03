package bucky;

public class T39_40_41 {
	private int hour;
	private int minute;
	private int second;
	
	public T39_40_41(){ //This is going to take the parameter from Tutorial_39_40_41 with 0 parameters & place them in this constructor
		this(0,0,0); //When this constructor has its new #'s it will be call from setTime
	}
	public T39_40_41(int h){//This is going to take the parameter from Tutorial_39_40_41 with 1 parameters & place them in this constructor
		this(h,0,0);
	}
	public T39_40_41(int h, int m){//This is going to take the parameter from Tutorial_39_40_41 with 2 parameters & place them in this constructor
		this(h,m,0);
	}
	public T39_40_41(int h, int m, int s){//This is going to take the parameter from Tutorial_39_40_41 with 3 parameters & place them in this constructor
		setTime(h,m,s); //This constructor calls the setTime method
	}
	public void setTime(int h, int m, int s){ // This is the setTime method
		setHour (h); //This will call the setHour method (h)
		setMinute (m); //This will call the setMinute method (m)
		setSecond (s); //This will call the setSecond method (s)
	}
	
	public void setHour(int h){ //This is the setHour method & will make sure the hour is greater than 0 & less than 24
		hour = ((h>=0&&h<24) ?h:0);//("?s" is asking is the math true) (":" if not use 0) 
	}
	public void setMinute(int m){ //This is the setMinute method & will make sure the minute is greater than 0 & less than 60
		minute = ((m>=0&&m<60) ?m:0);//("?s" is asking is the math true) (":" if not use 0) 
	}
	public void setSecond(int s){ //This is the setSecond method & will make sure the second is greater than 0 & less than 60
		second = ((s>=0&&s<60) ?s:0); //("?s" is asking is the math true) (":" if not use 0) 
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	public String toMilitary() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
}
