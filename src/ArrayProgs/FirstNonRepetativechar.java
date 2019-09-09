package ArrayProgs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepetativechar {
	public static void firstNonRepetative(String str) {
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
		for (char c : str.toCharArray()) {
			if (lhm.containsKey(c)) {
				lhm.put(c, lhm.get(c) + 1);
			} else
				lhm.put(c, 1);
		}
		Set<Map.Entry<Character, Integer>> set = lhm.entrySet();
		for (Map.Entry<Character, Integer> entry : set) {
			if (entry.getValue() > 1) {
				System.out.printf("%s:%d%n", entry.getKey(), entry.getValue());
			}

		}
		// throw new RuntimeException("didn't find any non repeated Character");

	}

	public static char method2(String str) {
		Map<Character, Integer> lhm = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (lhm.containsKey(c)) {
				lhm.put(c, lhm.get(c) + 1);
			} else
				lhm.put(c, 1);
		}

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (lhm.get(c) == 1) {
				return c;
			}
		}
		throw new RuntimeException("didn't find any non repeated Character");
	}

	public static void main(String[] args) {

		firstNonRepetative("nazeeyasulthanashaik");
		// TODO Auto-generated method stub

	}

}
