package week3.homeassignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {
	public static void main(String[] args) {
		Integer[] a = new Integer[]{1, 2, 3, 4, 10, 6, 8};
		List<Integer> l = new ArrayList<Integer>();
		Collections.addAll(l, a);
		Collections.sort(l);
		for (int i = 0; i < a.length-1; i++) {
		
			if (l.get(i+1)!=l.get(i)+1) {
				l.add(l.get(i)+1);

			}
		}
		Collections.sort(l);
		System.out.println(l);

	}

}
