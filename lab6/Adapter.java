package skeleton;

import java.util.HashMap;

public class Adapter {
	public static final String[] BEVERAGES = new String[] {
			"Caffè Americano", "Caffè Mocha", "Caffè Latte", 
			"Cappuccino", "Caramel Macchiato", "Espresso" }; // You can change these

	/**
	* This function compute the edit distance between a string and every 
	* strings in your selected beverage set. The beverage with the minimum 
	* edit distance <= 3 is returned. The use of Wagner_Fischer algorithm
	* is shown in the main function in WagnerFischer.java
	**/
	public String getBeverage(String s){
		// TODO: find the word with minimum edit distance
		String found = "";
 		int minDistance = -1;
 
 		for (String beverage: BEVERAGES) {
 			WagnerFischer wf = new WagnerFischer(beverage, s);
 			if (minDistance == -1 || wf.getDistance() < minDistance){
 				found = beverage;
 				minDistance = wf.getDistance();
 			}
 		}
 
 		return (minDistance > 3)? null: found;
	}
}
