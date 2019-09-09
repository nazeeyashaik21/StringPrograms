package StringPrograms20;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class charOccerance {
	public static void charOccur(String str) {
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);

			} else {
				map.put(c, 1);
			}

		}
		
		Set<Map.Entry<Character, Integer>> entrys = map.entrySet();
		for(Map.Entry<Character, Integer> entry:entrys) {
			System.out.printf("[%s:%d]%n", entry.getKey(),entry.getValue());
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		charOccur("nazeeyasulthana");
	}

}
