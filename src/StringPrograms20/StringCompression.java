package StringPrograms20;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class StringCompression {
	public static String stringCompression(String str) {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count++;
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				sb.append(str.charAt(i));
				sb.append(count);
				count = 0;
			}

		}
		return sb.toString();
	}

	public static void stringCompressionMap(String str) {
		char[] ch = str.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap();

		for (Character c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entrys = map.entrySet();
		for(Map.Entry<Character, Integer> entry: entrys) {
			System.out.print(entry.getKey());
			System.out.print(entry.getValue());
			
		}
	}

	public static void main(String[] args) {
		String comp = stringCompression("aaaaafffffeeejjwwx");
		System.out.println("Compressed String  " + comp);
		stringCompressionMap("aaaaafffffeeejjwwx");
	}

}
