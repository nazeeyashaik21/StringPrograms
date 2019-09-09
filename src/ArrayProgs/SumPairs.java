package ArrayProgs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SumPairs {

	public static void printPairs(int[] arr, int num) {
		if (arr.length < 2) {
			return;
		}

		Set set = new HashSet(arr.length);
		for (int val : arr) {
			int target = num - val;
			if (!set.contains(target)) {
				set.add(val);

			} else {
				System.out.printf(("(%d, %d) %n"), val, target);
			}
			//System.out.println(set);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 1, 8, 45, 6, 10, 8 };
		printPairs(a, 51);
	}

}
