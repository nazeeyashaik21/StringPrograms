package ArrayProgs;

import java.util.Arrays;
import java.util.BitSet;

public class findMissingNumber {

	public static void missingNumber(int[] numbers, int count) {
		int missingCount = count - numbers.length;
		BitSet bitset = new BitSet(count);

		for (int num : numbers) {
			bitset.set(num - 1);
		}
		System.out.println(bitset);
		System.out.printf("missing numbers" + Arrays.toString(numbers), count);
		int lastMissingIndex = 0;
		for (int i = 0; i < missingCount; i++) {
			lastMissingIndex = bitset.nextClearBit(lastMissingIndex);
			System.out.println();
			System.out.println("missing" + (++lastMissingIndex));

		}

	}

	public static void missingNumber2(int[] a, int num) {
		int[] reg = new int[a.length];
		for (int i:a) {
			reg[i] = 1;
		}
		//System.out.println(reg);
		System.out.println("Missing number in arra when duplictes ");
		for(int i =1;i<reg.length;i++) {
			System.out.println(reg[i]);
			if(reg[i]==0) {
				System.out.println(i);
			}
		}
		
	}

	public static void missingNumberXOR(int[] a, int count) {
		int X1 = a[0];
		int X2 = 1;

		for (int i = 1; i < count; i++) {
			X1 = X1 ^ a[i];
			// System.out.println(X1);
		}
		for (int i = 1; i <= count + 1; i++) {
			X2 = X2 ^ i;
			// System.out.println(X2);

		}
		System.out.println(X1 ^ X2);
	}

	public static void main(String[] args) {
		missingNumber2(new int[] { 1, 2, 3, 4, 6, 7, 8, 9,10 },10);

	}

}
