package bucky;

import java.util.Random;  //We imported a random number generator 

public class Tutorial_30_Array_Elements_As_Counters {
	
	public static void main(String[] args){
		
		Random rand = new Random();
		int freq[] = new int[7];  //We created an array called freq and we set equal to 7 elements in that array
		// We set it to seven because arrays start at zero (which we arent using) and dice have 6 faces. so 0,1,2,3,4,5,6 = 7 elements
		
		
		for(int roll = 1; roll < 1000; roll++ ){ //This for loop is going to roll the dice 1000 times
			++freq[1+rand.nextInt(6)]; //rand.nextInt(6) is going to give the #s 0-5(because arrays start at ZERO) the 1+ is going to shift the #s to give you 1-6
		/* ++freq adds 1 each time that this hits that # (ex: 1,2,3,4,5,6 are all set to Zero to begin with if this rolls and it gets a 3 then
		 * freq 3 is going to = 1, if its rolled again and it hits 3 freq 3 is going to = 2.  Its going to keep count of all those indexes and add 1 to that index
		*/
		}
		
		System.out.println("Face\tFrequency");  // Face = index # and Frequency = array value
		
		for(int face = 1; face < freq.length; face++){  //This loop is going to go 1-6
			System.out.println(face+ "\t" + freq[face]);
		}
		
	}

}
//This was an example of a counter controlled for statement
//This program takes Array Elements and stores them as counters.  This is like a dice being rolled a 1000 times and telling you what was rolled