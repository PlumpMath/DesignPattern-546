/**
 * @author Nikhil V
 *
 * Aug 4, 2015
 */
package com.nikhil.abstractFactory.model;

import com.nikhil.abstractFactory.factoryclass.ColorFactory;

/**
 * @author Nikhil V
 *
 */
public class Red extends AbstractColor {

	
	static
	{
		ColorFactory.getInstance().getRegisterColor().put(RED, new Red());
	}
	
	
	@Override
	public void fill() {
		// TODO Auto-generated method stub
		System.out.println("Red");
	}

	
	@Override
	public Color getInstance() {
		// TODO Auto-generated method stub
		return new Red();
	}

}
