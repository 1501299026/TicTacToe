package com.constructor;

public class H {
	H(){
		System.out.println("default ctt of class H");
	}
 H(int i){
	 System.out.println("parametersed ctt of class of H");
 }

}
class I extend H
{
	I(){
	
	this(10);
			System.out.println("default ctt of class i");
		
	}
		I(int i){
			System.out.println("parameterised ctt of class i");
			
		}

}
	
class Test
{
	public static void main(String[] args) {
   I obj1=new I();
   System.out.println("------------");
   I obj2=new I(10);
   H obj =new H();
	}
}





