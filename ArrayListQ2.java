//Q2.Write a program  to find the length of  a ArrayList

package AnudipProject;

import java.util.ArrayList;

public class ArrayListQ2 {
	public static void main(String args[]) {
		ArrayList<String> l1 =new ArrayList<String>();    //creating arraylist
		
		l1.add("JAVA");
		l1.add("PYTHON");
		l1.add("C#");
		l1.add("RUBY");
		l1.add("PERL");
		
		for(String p:l1)          //Iteration
		{
			System.out.println(p);
		}
		
		//length of the arraylist 
		System.out.println("The length of the Arraylist: "+l1.size()); 

	}

}
