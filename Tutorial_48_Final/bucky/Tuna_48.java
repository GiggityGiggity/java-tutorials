package bucky;

public class Tuna_48 {
	private int sum;
	private final int NUMBER;
	
	public Tuna_48 (int x){
		NUMBER = x;
	}
	
	public void add(){
		sum+=NUMBER;
	}
	
	public String toString(){
		return String.format("sum = %d\n", sum);
	}

}
