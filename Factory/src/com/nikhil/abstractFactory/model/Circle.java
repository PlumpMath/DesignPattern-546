/**
 * @author Nikhil V
 *
 * Aug 4, 2015
 */
package com.nikhil.abstractFactory.model;

import com.nikhil.abstractFactory.factoryclass.ShapeFactory;

/**
 * @author Nikhil V
 * 
 */

public class Circle extends AbstractShape {
	
	
	static
	{
		ShapeFactory.getInstance().getRegisterShape().put(CIRCLE_ID, new Circle());
	}

	@Override
	public void onDraw() {
		// TODO Auto-generated method stub
		System.out.println("\nCircle");
	}

	@Override
	public Shape getInstance() {
		// TODO Auto-generated method stub
		return new Circle();
	}

	

	
	
	
	

}
