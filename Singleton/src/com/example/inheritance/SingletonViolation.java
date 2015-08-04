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
public class SingletonViolation {
	
	public SingletonViolation()
	{
		//creating another instance of singleton since constructor is protected and in same package 
		
		/*
		 * First of all, if the constructor is protected, it means that the class can be instantiated by
		 *  calling the constructor from another class in the same package. A possible solution to avoid it is
		 *   to create a separate package for the singleton.
		 */
		
		SingletonBaseClass singleton = new SingletonBaseClass();
		System.out.println("SingletonViolation");
		
		singleton.print();
	}

}
