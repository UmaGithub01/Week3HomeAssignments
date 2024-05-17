package week3.homeassignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {
		Integer[] a= new Integer[] {3, 2, 11, 4, 6, 7};
		List<Integer> l=new ArrayList<Integer>();
		Collections.addAll(l, a);
		Collections.sort(l);
		int s=l.size()-2;
		System.out.println(l.get(s));
	}

}
