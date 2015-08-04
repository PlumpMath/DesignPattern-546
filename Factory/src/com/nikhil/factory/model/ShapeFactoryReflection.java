/**
 * @author Nikhil V
 *
 * Aug 4, 2015
 */
package com.nikhil.factory.model;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Nikhil V
 * 
 */
public class ShapeFactoryReflection {

	private static ShapeFactoryReflection instance;

	private Map<Integer, Class> registerShape = new HashMap<Integer, Class>();

	public void setRegisterShape(Map<Integer, Class> registerShape) {
		this.registerShape = registerShape;
	}

	private ShapeFactoryReflection() {

	}

	public static ShapeFactoryReflection getInstance() {
		if (instance == null)
			instance = new ShapeFactoryReflection();
		return instance;
	}

	public Shape getShapeInstance(int shapeId) throws NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		Class shapeClass = registerShape.get(shapeId);
		return (Shape) shapeClass.newInstance();
	}

}
