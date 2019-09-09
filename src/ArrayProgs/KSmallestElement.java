package ArrayProgs;

import java.util.Arrays;

public class KSmallestElement {
	public static int method1(int[] a, int k) {

		Arrays.sort(a);

		return a[k - 1];
	}

	public static void method2(int[] a, int k) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
			if (i == k - 1) {
				System.out.println(a[i]);
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 12, 3, 4, 9, 54, 2 };
		int ksmallest = method1(array, 3);
		System.out.println(ksmallest);
		method2(array,3);
	}

}
