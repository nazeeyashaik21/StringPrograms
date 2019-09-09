package StringPrograms20;

public class IsAnogram {
	public static boolean isAnogram(String input, String anogram) {
		char[] ch = input.toCharArray();
		if (input.length() != anogram.length()) {
			return false;
		}
		for (char c : ch) {
			int index = anogram.indexOf(c);
			if (index != -1) {
				anogram = anogram.substring(0, index) + anogram.substring(index + 1, anogram.length());

			} else
				return false;
		}
		return anogram.isEmpty();

	}

	public static void main(String[] args) {
		boolean flag = isAnogram("dormitory", "dirtyroom");
		if (flag) {
			System.out.println("Given Strings are Anogram");

		} else {
			System.out.println("Given strings are not Anogram");
		}
	}

}
