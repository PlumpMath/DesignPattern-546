/**
 * @author Nikhil V
 *
 * Aug 4, 2015
 */
package com.nikhil.factory.model;

import com.nikhil.factory.factoryclass.ShapeFactoryClassRegistration;

/**
 * @author Nikhil V
 *
 */
public class Rectangle extends AbstractShape  {

	
	static
	{		
		 ShapeFactoryClassRegistration.getInstance().getRegisterShape().put(Shape.RECTANGLE_ID, new Rectangle());
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
