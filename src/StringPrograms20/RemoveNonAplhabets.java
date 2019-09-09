package StringPrograms20;

public class RemoveNonAplhabets {
	public static void removeNonAlpha(String str) {
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("String after removing non alphabets:   " + str);
	}

	public static void remove(String str) {
		String s = "";
		char[] ch = str.toCharArray();
		for (char c : ch) {
			
		
			if ( Character.isLetterOrDigit(c)) {
				s = s + c;

			}
		}

		System.out.println("remove non alphabets by Characer class "+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 removeNonAlpha("nazeeya@shaik*sulthana21");
		remove("nazeeya@shaik*sulthana21");

	}

}
