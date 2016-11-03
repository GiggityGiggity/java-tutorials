package bucky;

public class Tuna_47 {
	private String first;
	private String last;
	private static int members = 0; //They all share this members variable because its static
	
	public Tuna_47(String fn, String ln){
		first = fn;
		last = ln;
		members++;
		System.out.printf("Constructors for %s %s, members in the club: %d\n", first, last, members);
	}
	
	
	
	
	
	public String getFirst(){
		return first;
	}
	public String getLast(){
		return last;
	}
	public static int getMembers(){
		return members;
	}

}