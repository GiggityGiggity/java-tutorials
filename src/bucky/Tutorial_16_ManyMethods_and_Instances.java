package bucky;

public class Tutorial_16_ManyMethods_and_Instances {                  //public variable any class can use that variable
	private String girlName;                                         //private variable only the methods inside this class can use it.
	
	public void setName (String name){
		girlName = name;
	}
	public String getName(){
		return girlName;
	}
	
	public void saying(){
	//	System.out.printf(format, args)      format = whatever text you want  %s = wants to know what string to put in place of this   args =the var name in this case getName
		System.out.printf("Your first gf was %s", getName());
	}

}

//
//
//
//THIS TUTORIAL IS BACKSWARDS COMPARED TO THE T15 & T14 IN THE WAY IT CALLS THE CLASSES BECAUSE THE GUY ON YOUTUBE IS DUMB
//
//
//