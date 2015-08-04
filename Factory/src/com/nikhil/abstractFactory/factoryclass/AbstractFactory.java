/**
 * @author Nikhil V
 *
 * Aug 4, 2015
 */
package com.nikhil.abstractFactory.factoryclass;

import com.nikhil.abstractFactory.model.Color;
import com.nikhil.abstractFactory.model.Shape;

/**
 * @author Nikhil V
 *
 */
public abstract class AbstractFactory {
	
	public abstract Shape getShape(int shapeid);
	public abstract Color getColor(int colorid);

}
