/**
 * @author Nikhil V
 *
 * Aug 10, 2015
 */
package com.nikhil.builder.builder;

import java.util.ArrayList;
import java.util.List;

import com.nikhil.builder.model.Item;

/**
 * @author Nikhil V
 *
 */
public class Meal {
	
	private List<Item> itemList = new ArrayList<Item>();
	
	public void addItem(Item item)
	{
		itemList.add(item);
	}
	
	
	 public float getCost(){
	      float cost = 0.0f;
	      
	      for (Item item : itemList) {
	         cost += item.getItemPrice();
	      }		
	      return cost;
	   }

	   public void showItems(){
	   
	      for (Item item : itemList) {
	         System.out.print("Item : " + item.getItemName());
	         System.out.print(", Packing : " + item.packing().pack());
	         System.out.println(", Price : " + item.getItemPrice());
	      }		
	   }
	
	

}
