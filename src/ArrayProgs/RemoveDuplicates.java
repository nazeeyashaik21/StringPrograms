package ArrayProgs;

import java.util.Arrays;

public class RemoveDuplicates {

	public static int[] removeDuplicate(int[] withDup) {
		Arrays.sort(withDup);
		int[] res = new int[withDup.length];

		int prev = withDup[0];
		res[0] = prev;

		for (int i = 1; i < withDup.length; i++) {
			int ch = withDup[i];
			if (prev != ch) {
				res[i] = ch;
			}

			prev = ch;
		}
return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] withdup = new int[]{1,2,3,2,3,5,6,3,8,6};
		System.out.println("Array with Duplicates       : " + Arrays.toString(withdup));
		int[] res= removeDuplicate(withdup);
		System.out.println("Array with Duplicates       : " + Arrays.toString(res));
		
	}

}
