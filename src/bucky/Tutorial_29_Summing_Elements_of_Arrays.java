package bucky;

public class Tutorial_29_Summing_Elements_of_Arrays {
	
	public static void main(String[] args){
		
		int bucky[] = {21,16,86,21,3};
		int sum = 0;
		
		for(int counter = 0; counter<bucky.length; counter++){ // bucky.length = how many indexes you have
			sum+=bucky[counter]; //sum+= means add each value in the bucky array to sum which starts out at zero
			//bucky[counter] means get each value in the array bucky
		}
		
		System.out.println("The sum of these numbers equal " + sum);
		
	}

}
