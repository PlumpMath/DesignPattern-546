/**
 * @author Nikhil V
 *
 * Aug 3, 2015
 */
package com.example.inheritance;

/**
 * @author Nikhil V
 *
 */
public class SingletonSubclass extends SingletonBaseClass {
	
	
	/*
	 * in order to use the derived class all the getInstance calls should be changed in the existing code
	 *  from SingletonBaseClass.getInstance() to SingletonSubclass.getInstance().
	 */
	private static SingletonSubclass instance;
	private SingletonSubclass()
	{
		
	}
	public static SingletonSubclass getInstance()
	{
		if(instance == null)
			 instance = new SingletonSubclass();
		return instance;
	}
	public void printdata()
	{
		System.out.println("InheritedClass");
	}
}
