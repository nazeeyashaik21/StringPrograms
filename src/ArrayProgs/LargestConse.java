package ArrayProgs;

import java.util.HashSet;

public class LargestConse {

	public static int longestConsecutive(int[] nums) {
		HashSet<Integer> set = new HashSet();
		for (int n : nums)
			set.add(n);

		int result = 0;
		for (int num : nums) {
			int count = 1;
			int down = num - 1;
			while (set.contains(down)) {
				set.remove(down);
				down--;
				count++;
			}
			int up = num + 1;
			while (set.contains(up)) {
				set.remove(up);
				up++;
				count++;
			}
			result = Math.max(result, count);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] n = new int[] {100,4,1,101,3,102,4,2,103,5,104,105};
		int count = longestConsecutive(n);
		System.out.println("longest Consecutive occurence   "+count);

	}

}
