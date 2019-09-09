package StringPrograms20;

import java.util.regex.Pattern;

public class IsAlphates {
	public static boolean isAlphates(String s) {
		//boolean flag= false;
		Pattern pattern= Pattern.compile("[a-zA-Z]*");
		boolean flag = pattern.matcher(s).matches();
		
			if (flag) {
				return true;
			} else
				return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAlphates("nazeeyasulthana"));

	}

}
