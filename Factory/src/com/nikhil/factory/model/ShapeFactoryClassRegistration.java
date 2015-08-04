/**
 * @author Nikhil V
 *
 * Aug 4, 2015
 */
package com.nikhil.factory.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Nikhil V
 *
 */
public class ShapeFactoryClassRegistration {
	
	private static ShapeFactoryClassRegistration instance;

	private Map<Integer, AbstractShape> registerShape = new HashMap<Integer, AbstractShape>();

	

	public Map<Integer, AbstractShape> getRegisterShape() {
		return registerShape;
	}

	public void setRegisterShape(Map<Integer, AbstractShape> registerShape) {
		this.registerShape = registerShape;
	}

	private ShapeFactoryClassRegistration() {

	}

	public static ShapeFactoryClassRegistration getInstance() {
		if (instance == null)
			instance = new ShapeFactoryClassRegistration();
		return instance;
	}

	public Shape getShapeInstance(int shapeId)  {

		
		return  registerShape.get(shapeId).getInstance();
	}
	
	

}
