/**
 * @author Nikhil V
 *
 * Aug 10, 2015
 */
package com.nikhil.builder.model;

/**
 * @author Nikhil V
 *
 */
public abstract class CoolDrinks implements Item{

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}
	
}
