/**
 * @author Nikhil V
 *
 * Aug 4, 2015
 */
package com.nikhil.abstractFactory.main;

import com.nikhil.abstractFactory.factoryclass.AbstractFactory;
import com.nikhil.abstractFactory.factoryclass.FactoryProducer;
import com.nikhil.abstractFactory.model.Color;
import com.nikhil.abstractFactory.model.Shape;

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
			Class.forName("com.nikhil.abstractFactory.model.Red");
			Class.forName("com.nikhil.abstractFactory.model.Blue");
			Class.forName("com.nikhil.abstractFactory.model.Green");
			
			Class.forName("com.nikhil.abstractFactory.model.Circle");
			Class.forName("com.nikhil.abstractFactory.model.Rectangle");
			Class.forName("com.nikhil.abstractFactory.model.Square");
			
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		
		AbstractFactory factory = FactoryProducer.getInstance(FactoryProducer.SHAPE);
		
		factory.getShape(Shape.CIRCLE_ID).onDraw();
		factory.getShape(Shape.RECTANGLE_ID).onDraw();
		factory.getShape(Shape.SQUARE_ID).onDraw();
		
		factory = FactoryProducer.getInstance(FactoryProducer.COLOR);
		
		factory.getColor(Color.RED).fill();
		factory.getColor(Color.BLUE).fill();
		factory.getColor(Color.GREEN).fill();
		

	}

}
