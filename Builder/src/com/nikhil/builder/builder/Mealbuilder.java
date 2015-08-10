/**
 * @author Nikhil V
 *
 * Aug 10, 2015
 */
package com.nikhil.builder.builder;

import com.nikhil.builder.model.ChikenBurger;
import com.nikhil.builder.model.Coke;
import com.nikhil.builder.model.Pepsi;
import com.nikhil.builder.model.VegBurger;

/**
 * @author Nikhil V
 *
 */
public class Mealbuilder {
	
	private Meal meal = new Meal() ;
	
	
	
	public Meal getVegMeal()
	{
		
		meal.addItem(new VegBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
	
	public Meal getNonVegMeal()
	{
	
		meal.addItem(new ChikenBurger());
		meal.addItem(new Coke());
		return meal;
	}
	

	
	
	
	

}
