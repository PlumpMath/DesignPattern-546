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
public abstract class Burger implements Item{

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}
	
	

}
