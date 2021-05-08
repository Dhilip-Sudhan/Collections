package AssignmentWeek3Day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	// Input: "PayPal India"
	// Output:PaylIndi
	
	public static void main(String[] args) {
		
//		Declare a String as PayPal India
		String input = "PayPal India";

//		Convert it into a character array
		char[] charArray = input.toCharArray();
		
//		Declare a Set as charSet for Character
		Set<Character> charSet = new HashSet<Character>();
		
//		Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupCharSet = new HashSet<Character>();
		
//		Iterate character array and add it into charSet
//		if the character is already in the charSet then, add it to the dupCharSet

//		Check the dupCharSet elements and remove those in the charSet

//		Iterate using charSet

//		Check the iterator variable isn't equals to an empty space

		for (int i = 0; i < charArray.length; i++) {
			if(charSet.contains(charArray[i])) {
				dupCharSet.add(charArray[i]);
			} else {
				if(charArray[i]!=' ') {
					charSet.add(charArray[i]);
				}
			}
		}
		
//		print each character for charSet
		System.out.println("The Character set is " + charSet);
		System.out.println("The Duplicate Character set is " + dupCharSet);




	}

}
