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
public class Square extends AbstractShape {
	
	
	static
	{
		ShapeFactory.getInstance().getRegisterShape().put(SQUARE_ID, new Square());
	}
	

	@Override
	public void onDraw() {
		// TODO Auto-generated method stub
		System.out.println("Square");
	}

	
	@Override
	public Shape getInstance() {
		// TODO Auto-generated method stub
		return new Square();
	}

	


	

}
