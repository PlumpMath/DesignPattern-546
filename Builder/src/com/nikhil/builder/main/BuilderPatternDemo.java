/**
 * @author Nikhil V
 *
 * Aug 10, 2015
 */
package com.nikhil.builder.main;

import com.nikhil.builder.builder.Meal;
import com.nikhil.builder.builder.Mealbuilder;

/**
 * @author Nikhil V
 *
 */
public class BuilderPatternDemo {

	/**
	@author Nikhil V
	Aug 10, 2015
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Mealbuilder mealbuilder = new Mealbuilder();
		
			Meal vegMeal = mealbuilder.getVegMeal();
		      System.out.println("Veg Meal");
		      vegMeal.showItems();
		      System.out.println("Total Cost: " + vegMeal.getCost());

		      Meal nonVegMeal = mealbuilder.getNonVegMeal();
		      System.out.println("\n\nNon-Veg Meal");
		      nonVegMeal.showItems();
		      System.out.println("Total Cost: " + nonVegMeal.getCost());
			
			
			
			
			
			
	}

}
