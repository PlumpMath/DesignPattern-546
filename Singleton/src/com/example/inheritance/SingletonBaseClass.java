package com.example.inheritance;
/**
 *
 @author Nikhil V
 *
 * Aug 3, 2015
 */

/**
 * @author Nikhil V
 *
 */
public class SingletonBaseClass {
	
	protected static SingletonBaseClass object;
	
	protected SingletonBaseClass()
	{
		
	}
	
	public static SingletonBaseClass getInstance()
	{
		if(object == null)
			object = new SingletonBaseClass();
		return object;
	}
	
	public void print()
	{
		System.out.println("SingletonBaseClass");
	}
	
	

}
