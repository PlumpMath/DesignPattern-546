/**
 * @author Nikhil V
 *
 * Aug 4, 2015
 */
package com.nikhil.abstractFactory.factoryclass;

import java.util.HashMap;
import java.util.Map;

import com.nikhil.abstractFactory.model.AbstractShape;
import com.nikhil.abstractFactory.model.Color;
import com.nikhil.abstractFactory.model.Shape;


/**
 * @author Nikhil V
 *
 */
public class ShapeFactory  extends AbstractFactory {

	private static ShapeFactory instance;
	private Map<Integer, AbstractShape> registerShape = new HashMap<Integer, AbstractShape>();
	
	public Map<Integer, AbstractShape> getRegisterShape() {
		return registerShape;
	}


	public void setRegisterShape(Map<Integer, AbstractShape> registerShape) {
		this.registerShape = registerShape;
	}


	@Override
	public Shape getShape(int shapeid) {
		// TODO Auto-generated method stub
		return registerShape.get(shapeid).getInstance();
	}

	
	@Override
	public Color getColor(int colorid) {
		// TODO Auto-generated method stub
		return null;
	}

	
	private ShapeFactory()
	{
		
	}
	
	public static ShapeFactory getInstance()
	{
		if(instance == null)
			instance = new ShapeFactory();
		return instance;
	}

}
