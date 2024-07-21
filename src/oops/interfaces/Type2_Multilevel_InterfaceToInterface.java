package oops.interfaces;

interface Continent{ 
  void showContinent(); 
} 

interface Country extends Continent{ 
 void showCountry(); 
} 

interface State extends Country{ 
  void showState(); 
} 

class City implements State
{

	@Override
	public void showCountry() {
		System.out.println("India"); 
	}

	@Override
	public void showContinent() {
		System.out.println("Asia"); 
	}

	@Override
	public void showState() {
		System.out.println("Maharshtra"); 
	} 
	
	public void showCity() {
		System.out.println("Navi Mumbai");
	}
	
}
public class Type2_Multilevel_InterfaceToInterface {

	public static void main(String[] args) {
		
		  // MultiLevel interface 
		
		   City c = new City(); 
		   c.showContinent(); 
		   c.showCountry(); 
		   c.showState(); 
		   c.showCity(); 
	}
}
