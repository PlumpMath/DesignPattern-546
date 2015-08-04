/**
 * @author Nikhil V
 *
 * Aug 4, 2015
 */
package com.nikhil.factory.main;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import com.nikhil.factory.model.Circle;
import com.nikhil.factory.model.Rectangle;
import com.nikhil.factory.model.Shape;
import com.nikhil.factory.model.ShapeFactoryClassRegistration;
import com.nikhil.factory.model.ShapeFactoryNoob;
import com.nikhil.factory.model.ShapeFactoryReflection;
import com.nikhil.factory.model.ShapeFactorySingleton;
import com.nikhil.factory.model.Square;

/**
 * @author Nikhil V
 * 
 */
public class Main {

	/**
	 * @author Nikhil V Aug 4, 2015
	 * @param args
	 */

	
	static
	{
		try
		{
			Class.forName("com.nikhil.factory.model.Circle");
			Class.forName("com.nikhil.factory.model.Rectangle");
			Class.forName("com.nikhil.factory.model.Square");
		}
		catch (ClassNotFoundException any)
		{
			any.printStackTrace();
		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// implementShapeFactoryNoob();

		//implementShapeFactorySingleton();
		
		//implementSingletonReflection();
		
		implementclassRegistration();

	}

	/**
	@author Nikhil V
	Aug 4, 2015
	 */
	private static void implementclassRegistration() {
		// TODO Auto-generated method stub
		System.out.println("implementclassRegistration");
		
		Shape object;
		
		
		
		object = ShapeFactoryClassRegistration.getInstance().getShapeInstance(Shape.CIRCLE_ID);
		object.onDraw();
		
		object = ShapeFactoryClassRegistration.getInstance().getShapeInstance(Shape.RECTANGLE_ID);
		object.onDraw();
		
		object = ShapeFactoryClassRegistration.getInstance().getShapeInstance(Shape.SQUARE_ID);
		object.onDraw();
		
	}

	/**
	@author Nikhil V
	Aug 4, 2015
	 */
	private static void implementSingletonReflection() {
		// TODO Auto-generated method stub
		System.out.println("implementSingletonReflection");
		
		
		
	
		try {
			
			Shape object;
			
			Map<Integer, Class> registerShape = new HashMap<Integer, Class>();
			registerShape.put(Shape.CIRCLE_ID, Circle.class);
			registerShape.put(Shape.RECTANGLE_ID, Rectangle.class);
			registerShape.put(Shape.SQUARE_ID, Square.class);
			
			ShapeFactoryReflection.getInstance().setRegisterShape(registerShape);
			
			object =ShapeFactoryReflection.getInstance().getShapeInstance(Shape.CIRCLE_ID);
			object.onDraw();
			object =ShapeFactoryReflection.getInstance().getShapeInstance(Shape.RECTANGLE_ID);
			object.onDraw();
			object =ShapeFactoryReflection.getInstance().getShapeInstance(Shape.SQUARE_ID);
			object.onDraw();
			
			
			
		} catch (NoSuchMethodException | SecurityException
				| InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

	/**
	 * @author Nikhil V Aug 4, 2015
	 */
	private static void implementShapeFactorySingleton() {
		// TODO Auto-generated method stub
		System.out.println("implementShapeFactorySingleton");

		ShapeFactorySingleton factory = ShapeFactorySingleton
				.getShapFactorySingleton();
		Shape object;

		object = factory.getShapeInstance(Shape.CIRCLE_ID);
		object.onDraw();

		object = factory.getShapeInstance(Shape.RECTANGLE_ID);
		object.onDraw();

		object = factory.getShapeInstance(Shape.SQUARE_ID);
		object.onDraw();

	}

	/**
	 * @author Nikhil V Aug 4, 2015
	 */
	private static void implementShapeFactoryNoob() {
		// TODO Auto-generated method stub
		System.out.println("implementShapeFactoryNoob\n");

		ShapeFactoryNoob factory = new ShapeFactoryNoob(Shape.CIRCLE_ID);

		Shape object = factory.getInstance();
		object.onDraw();

		factory = new ShapeFactoryNoob(Shape.RECTANGLE_ID);
		object = factory.getInstance();
		object.onDraw();

		factory = new ShapeFactoryNoob(Shape.SQUARE_ID);
		object = factory.getInstance();
		object.onDraw();
	}

}
