/**
 * @author Nikhil V
 *
 * Aug 4, 2015
 */
package com.nikhil.factory.main;

import com.nikhil.factory.model.Shape;
import com.nikhil.factory.model.ShapeFactoryNoob;

/**
 * @author Nikhil V
 *
 */
public class Main {

	/**
	@author Nikhil V
	Aug 4, 2015
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		implementShapeFactoryNoob();
		
		
			
			
			
			
			
			
			
	}

	/**
	@author Nikhil V
	Aug 4, 2015
	 */
	private static void implementShapeFactoryNoob() {
		// TODO Auto-generated method stub
		final int CIRCLE_ID=1,RECTANGLE_ID=2,SQUARE_ID=3;
		
		ShapeFactoryNoob factory	 = new ShapeFactoryNoob(CIRCLE_ID);
		
		Shape object = factory.getInstance();
		object.onDraw();
		
		
		factory = new ShapeFactoryNoob(RECTANGLE_ID);
		object = factory.getInstance();
		object.onDraw();
		
		
		factory = new ShapeFactoryNoob(SQUARE_ID);
		object = factory.getInstance();
		object.onDraw();
	}

}
