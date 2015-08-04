/**
 * @author Nikhil V
 *
 * Aug 4, 2015
 */
package com.nikhil.abstractFactory.factoryclass;

import java.util.HashMap;
import java.util.Map;

import com.nikhil.abstractFactory.model.AbstractColor;
import com.nikhil.abstractFactory.model.Color;
import com.nikhil.abstractFactory.model.Shape;

/**
 * @author Nikhil V
 *
 */
public class ColorFactory  extends AbstractFactory {

	
	private Map<Integer,AbstractColor> registerColor = new HashMap<Integer, AbstractColor>();
	private static ColorFactory instance;
	
	public Map<Integer, AbstractColor> getRegisterColor() {
		return registerColor;
	}


	public void setRegisterColor(Map<Integer, AbstractColor> registerColor) {
		this.registerColor = registerColor;
	}


	@Override
	public Shape getShape(int shapeid) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Color getColor(int colorid) {
		// TODO Auto-generated method stub
		return registerColor.get(colorid).getInstance();
	}
	
	public static ColorFactory getInstance()
	{
		if(instance == null)
			instance = new ColorFactory();
		return instance;
	}
	
	private ColorFactory()
	{
		
	}

	
	

}
