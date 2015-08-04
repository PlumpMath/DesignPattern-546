/**
 * @author Nikhil V
 *
 * Aug 3, 2015
 */
package com.nikhil.singleton.model.serilization;

import java.io.Serializable;

/**
 * @author Nikhil V
 *
 */

public class SingleTonSerializable implements Serializable{
	
	/**
	 * donot serilise singleton because
	 */
	private static final long serialVersionUID = 1L;
	
	private int age;
	private String name;
	private static SingleTonSerializable instace;
	
	public static  SingleTonSerializable getInstanace()
	{
		if(instace == null)
			instace = new SingleTonSerializable();
		return instace;
	}
	
	public void processData()
	{
		name = "Nikhil";
		age =26;
	}
	
	
	protected Object readResolve() {
		return getInstanace();
	}
	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SingleTonSerializable [age=" + age + ", name=" + name + "]";
	}

}
