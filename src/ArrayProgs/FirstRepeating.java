package ArrayProgs;

import java.util.HashSet;

public class FirstRepeating {
	public static void firstRepeatingNumber(int[] num) {
		int min = -1;
		HashSet<Integer> set = new HashSet();
		for (int i = num.length - 1; i >= 0; i--) {
			if (set.contains(num[i])) {
				min = i;

			} else
				set.add(num[i]);
		}
		if (min != -1) {
			
			System.out.println(" First repeated number " + num[min]);
		} else
			System.out.println("No repeating numbers");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = new int[] { 10, 2, 4, 5, 2, 6, 5, 8 };
		firstRepeatingNumber(n);

	}

}
