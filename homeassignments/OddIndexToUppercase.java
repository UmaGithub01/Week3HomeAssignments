package week3.homeassignments;



public class OddIndexToUppercase {

	public static void main(String[] args) {

		String test="changeme";
		// convert the given input to charArray
		char[] testArray=test.toCharArray();

		//Iterate through the characters
		for (int i = 0; i < testArray.length; i++) {
			if (i%2!=0) {
				//toUpperCase() method from the Character class
				testArray[i]=Character.toUpperCase(testArray[i]);

			}
			System.out.print(testArray[i]);

		}


	}

}
