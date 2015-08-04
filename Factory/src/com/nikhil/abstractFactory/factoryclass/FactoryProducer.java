/**
 * @author Nikhil V
 *
 * Aug 4, 2015
 */
package com.nikhil.abstractFactory.factoryclass;

/**
 * @author Nikhil V
 *
 */
public class FactoryProducer {
	
	public final static int SHAPE=1,COLOR=2;
	public static AbstractFactory getInstance(int type)
	{
		if(type == SHAPE)
			return ShapeFactory.getInstance();
		else if(type == COLOR)
			return ColorFactory.getInstance();
		else
			return null;
	}

}
