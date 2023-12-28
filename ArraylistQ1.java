//Q1.Write a program  to traverse a ArrayList

package AnudipProject;

import java.util.ArrayList;

public class ArraylistQ1 {
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
	}
}
