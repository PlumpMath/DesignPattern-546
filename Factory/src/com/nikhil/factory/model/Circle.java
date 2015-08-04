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


public class Circle extends AbstractShape  {

	
	static
	{		
		 ShapeFactoryClassRegistration.getInstance().getRegisterShape().put(Shape.CIRCLE_ID, new Circle());
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
