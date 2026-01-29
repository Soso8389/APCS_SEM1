/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf {
	public String name;
	public int age;
	

	public PooleDwarf() {		// Default Constructor
		name = new String("");
		age = 0;
	}

	public PooleDwarf(String name, int age){
		this.name=name;
		this.age=age;
	}

	/*	Accessor Methods */
	public String getName(){
		return name;
	}

	public int getAge(){
       System.out.println(age);
       return age;
	}

	/*	Mutator Methods	*/
	public void setName(String nane){
		return;
	}
	
	public void setAge(String age){
		return;
	}

	public boolean isSameName(String name){
		return this.name.equals(name);
	     
		
	}
}

