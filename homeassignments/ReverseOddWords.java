package week3.homeassignments;

public class ReverseOddWords {
	public static void main(String[] args) {
		String test = "I am a software tester";
		System.out.println(test);
		String[] testArray=test.split(" ");
		for (int i = 0; i < testArray.length; i++) {
			if(i%2!=0) {
			String replace=testArray[i];
			
			char[] c=replace.toCharArray();
			for (int j = c.length-1; j >= 0; j--) {
				System.out.print(c[j]);
				
			}}
			else {
				if(i==0) {System.out.print(testArray[i]+" ");}
				else {System.out.print(" "+testArray[i]+" ");}
			}
		}
	}

}
