package AssignmentWeek3Day2;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class ReverseMap {

	public static void main(String[] args) {
		// Insert elements to the TreeMap
		//Input:
		//Employee Info:

		//Emp_id|Emp_name
		//100	Hari
		//101     Naveen
		//102	Sam
		//104	Balaji

		//OutPut: Print Employee info in reverse order based on Emp_d
		
		Map<Integer, String> map = new TreeMap<Integer, String>(Collections.reverseOrder());
		map.put(100, "Hari");
		map.put(101, "Naveen");
		map.put(102, "Sam");
		map.put(103, "Balaji");
		
		System.out.println("Employee Info is :" + map);

	}

}
