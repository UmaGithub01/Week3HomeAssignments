package week3.homeassignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FindIntersection {
	public static void main(String[] args) {
		Integer[] a = new Integer[]   {3, 2, 11, 4, 6, 7};
		Integer[] b = new Integer[] {1, 2, 8, 4, 9, 7};


		List<Integer> l = new ArrayList<Integer>();

		Collections.addAll(l,a);	

		List<Integer> l1 = new ArrayList<Integer>();
		Collections.addAll(l1, b);



		for (int i = 0; i < l.size(); i++) {
			for (int j = 0; j < l1.size(); j++) {
				if (l.get(i)==l1.get(j)) {
					System.out.println(l.get(i));

				}

			}


		}

	}


}





