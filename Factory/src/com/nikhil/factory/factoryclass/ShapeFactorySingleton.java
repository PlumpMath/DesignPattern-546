/**
 * @author Nikhil V
 *
 * Aug 4, 2015
 */
package com.nikhil.factory.factoryclass;

import com.nikhil.factory.model.Circle;
import com.nikhil.factory.model.Rectangle;
import com.nikhil.factory.model.Shape;
import com.nikhil.factory.model.Square;

/**
 * @author Nikhil V
 *
 */
public class ShapeFactorySingleton {
	
	
	private static ShapeFactorySingleton instance;
	
	

	private ShapeFactorySingleton()
	{
		
	}
	
	public static ShapeFactorySingleton getShapFactorySingleton()
	{
		if(instance == null)
			instance = new ShapeFactorySingleton();
		return instance;
	}
	
	
	public Shape getShapeInstance(int shapeId)
	{
		switch(shapeId)
		{
		case 1:
			return new Circle();
		case 2:
			return new Rectangle();
		case 3:
			return new Square();
		}
		return null;
	}

}
