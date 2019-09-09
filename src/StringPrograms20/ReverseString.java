package StringPrograms20;

public class ReverseString {
	public static String reverse(String str) {
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);

		}
		return reverse;
	}

	public static String recursiveReverse(String str) {

		if (str == null || str.length() == 1) {
			return str;

		}
		return recursiveReverse(str.substring(1))+str.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev = reverse("nazeeya");
		String rerReverse = recursiveReverse("nazeeya");
		System.out.println("Reverse of string " + rerReverse);

	}

}
