package AssignmentWeek3Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortUsingCollections {

	public static void main(String[] args) {
		
		
//		Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		
		//String[] input  = {"HCL","Wipro","Aspire Systems","CTS"};
		List<String> lst = new ArrayList<String>();
		lst.add("HCL");
		lst.add("Wipro");
		lst.add("Aspire Systems");
		lst.add("CTS");
		
//		get the length of the array			
		System.out.println("Size of the array is: " + lst.size());

//		sort the array
		Collections.sort(lst,Collections.reverseOrder());
		
//		print the array
//		Required Output: Wipro, HCL , CTS, Aspire Systems
		System.out.println("Output is : " + lst);
		


	}

}
