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
public class Rectangle extends AbstractShape {
	
	
	static
	{
		ShapeFactory.getInstance().getRegisterShape().put(RECTANGLE_ID, new Rectangle());
	}
	

	@Override
	public void onDraw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle");
	}

	@Override
	public Shape getInstance() {
		// TODO Auto-generated method stub
		return new Rectangle();
	}

	
	

}
