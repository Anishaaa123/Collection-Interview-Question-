//Q4.Write a program to sort ArrayList in descending order

package AnudipProject;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListQ4 {
	public static void main(String args[]) {
		ArrayList<Integer> l1 =new ArrayList<Integer>();    //creating arraylist
		
		l1.add(9);
		l1.add(56);
		l1.add(45);
		l1.add(68);
		l1.add(34);
		
		System.out.println("Elements of the ArrayList is: " + l1);
		
        //Sorting in Descending Order		
		Collections.sort(l1, Collections.reverseOrder()); 
		System.out.println("Sorted ArrayList: " + l1);
		
	}

}
