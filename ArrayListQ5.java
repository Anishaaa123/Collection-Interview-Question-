//Q5.Write a program to remove element from specified index of Arraylist?

package AnudipProject;

import java.util.ArrayList;

public class ArrayListQ5 {
	public static void main(String args[]) {
		ArrayList<Integer> l1 =new ArrayList<Integer>();    //creating arraylist
		
		l1.add(9);
		l1.add(56);
		l1.add(45);
		l1.add(68);
		l1.add(34);
		
		System.out.println("Elements of the ArrayList: "+l1);
	
		//Remove element from the arraylist from  a specified index
		int n1 = l1.remove(2);                
		System.out.println("Removed Element is: " + n1);
		System.out.println("Updated ArrayList: " + l1);
		
	}


}
