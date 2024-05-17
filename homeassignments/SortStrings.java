package week3.homeassignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortStrings {
	public static void main(String[] args) {
		String[] s = new String[]  {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> l = new ArrayList<String>();
		Collections.addAll(l, s);
		Collections.sort(l);

		for (int i = l.size()-1; i >=0 ; i--) {
			if(i==0) {System.out.print(l.get(i));}
			else {
			System.out.print(l.get(i)+", ");}
			
		}
		
	}

}
