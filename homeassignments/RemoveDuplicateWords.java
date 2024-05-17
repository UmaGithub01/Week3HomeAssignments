package week3.homeassignments;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		System.out.println(text);
		String [] textArray=text.split(" ");

		//int count=1;
		for (int i = 0; i < textArray.length; i++) {
			String tocompare=textArray[i];

			for (int j = i+1; j < textArray.length; j++) {
				if (tocompare.equalsIgnoreCase(textArray[j])) {

					//count++;
					textArray[j]=" ";



				}

			}
			System.out.print(textArray[i]+" ");
		}
	}

}
