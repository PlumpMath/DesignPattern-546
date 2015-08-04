import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.example.serilization.SingleTonSerializable;



/**
 * @author Nikhil V
 *
 * Aug 3, 2015
 */

/**
 * @author Nikhil V
 * 
 */
public class Main {

	/**
	 * @author Nikhil V Aug 3, 2015
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String PATH = "D://Nikhil//serilization//obj.ser";
		
		/*SingletonSubclass instance = SingletonSubclass.getInstance();
		 instance.printdata();
		 instance.print();
		new SingletonViolation();*/
		
	SingleTonSerializable serializable = SingleTonSerializable.getInstanace();	
	serializable.processData();
		 try
	      {
	         FileOutputStream fileOut =
	         new FileOutputStream(PATH);
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(serializable);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in /tmp/employee.ser");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
		 
		 
		 
		 serializable.setAge(31);
		 serializable.setName("Sachin");
		 
		 SingleTonSerializable instance;
		 
		 try
	      {
	         FileInputStream fileIn = new FileInputStream(PATH);
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         instance = (SingleTonSerializable) in.readObject();
	         in.close();
	         fileIn.close();
	       System.out.println("\n instance "+instance);
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	        
	      }catch(ClassNotFoundException c)
	      {
	        
	         c.printStackTrace();
	       }
		 
		System.out.println("\n serializable "+serializable);
		
	}

}
