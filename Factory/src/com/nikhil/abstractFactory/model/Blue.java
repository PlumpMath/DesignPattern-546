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
public class Blue extends AbstractColor {

	static
	{
		ColorFactory.getInstance().getRegisterColor().put(BLUE, new Blue());
	}
	
	
	@Override
	public void fill() {
		// TODO Auto-generated method stub
		System.out.println("Blue");
	}

	/* 
	@author Nikhil V
	Aug 4, 2015
	(non-Javadoc)
	 * @see com.nikhil.abstractFactory.model.AbstractColor#getInstance()
	 */
	@Override
	public Color getInstance() {
		// TODO Auto-generated method stub
		return new Blue();
	}

}
