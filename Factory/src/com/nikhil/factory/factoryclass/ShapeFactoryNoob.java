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
public class ShapeFactoryNoob {
	
	private int shapeId;
	
	
	
	public ShapeFactoryNoob(int shapeId){
		this.shapeId =shapeId;
	}
	
	public Shape getInstance()
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
