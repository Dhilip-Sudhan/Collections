package AssignmentWeek3Day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterOccurance {

	public static void main(String[] args) {
		
		//Assingment : Map
		//Write a Java Program to Find the Occurance of Each Character in the given String : "welcome to Selenium automation"

		//PseudoCode:
		//1. Create a String with your name as value
			String name = "welcome to Selenium automation";
	
		//2. Convert the string into a char array
			char[] charArray = name.toCharArray();
			
		//3. Create an empty Map<Character,Integer>
			Map<Character, Integer> map =  new LinkedHashMap<Character, Integer>();
			System.out.println(charArray);
			
		//4. Iterate over the array
			for (int i = 0; i < charArray.length; i++) {
		
		//5. Check whether the Map contains the Character
				if(map.containsKey(charArray[i])) {
					Integer value = map.get(charArray[i]);
		//6. If it contains then increment the key (+1)
					int newvalue = value + 1;
					map.put(charArray[i], newvalue);
				} else {
		// 7. Add the character in the map & set the value as 1
					map.put(charArray[i], 1);
				}
			}
		//8. Print the Map
			System.out.println(map);

	}

}
