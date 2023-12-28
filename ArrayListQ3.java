//Q3.Given an element write a program to check if element (value) exists in ArrayList
package AnudipProject;

import java.util.ArrayList;

public class ArrayListQ3 {
	public static void main(String args[]) {
	ArrayList<Integer> l1 =new ArrayList<Integer>();    //creating arraylist
	
	l1.add(9);
	l1.add(56);
	l1.add(45);
	l1.add(68);
	l1.add(34);
	
	System.out.println("Elements of the ArrayList: "+l1);
	
	
	//Given element contains in the arraylist or not 
	if(l1.contains(56)) 
	{
		System.out.println("The element does exist in the Arraylist");
	}
	else {
		System.out.println("The element doesn't exist in the Arraylist");
	}
	}

}
