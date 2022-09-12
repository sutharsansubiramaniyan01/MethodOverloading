package main;

class Addition { 						 
	static int add(int var1,int var2){ // Create static method with two parameters.
		return var1 + var2;			  	
	}  
	static int add(int var1,int var2, int var3){ // Create method same name add with three parameters. 
		return var1 + var2 + var3;			  	
	}  
	static double add(double var1,double var2){ // create method add with two variables but return type is double.
		return var1 + var2 ;
	}  
//	static int add(double var2, double var2){   // Create method with same name but return type is different from parameters.
//		return var1 + var2;						// This method return the error 'Is already defined in class addition'.
}  
public class Overloading{  
	public static void main(String[] args){  	// Main method of class
		System.out.println(Addition.add(5,14)); // We can call the static methods with out create objects. 
		System.out.println(Addition.add(10,15,14));  
		System.out.println(Addition.add(7,21));  
	}
} 
