package ArrayProgs;

import java.util.Arrays;

public class IsPresent {

	public static <T> boolean isPresent(T[] a, T num) {

		for (T i : a) {
			if (i == num || num != null && num.equals(i)) {
				return true;

			}

		}
		return false;

	}

	public static void main(String[] args) {
		String[] input = new String[]{"naz","afsheen","pervez"};
        System.out.printf("Does array %s has %s?  %b %n", Arrays.toString(input), 5, isPresent(input, "perfvez"));


	}

}
