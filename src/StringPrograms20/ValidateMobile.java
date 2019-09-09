package StringPrograms20;

import java.util.regex.Pattern;

public class ValidateMobile {
	public static boolean mobileValidation(String s) {
		//boolean flag= false;
		//Pattern pattern = Pattern.compile("\\(\\d{3}\\)\\d{3}-?\\d{4}");
		Pattern pattern = Pattern.compile("\\(\\d{3}\\)\\d{3}-?\\d{4}|(?:\\d{3}-){2}\\d{4}");
		//Pattern pattern= Pattern.compile("[0/91]*?[7-9][0-9]{9}");
		boolean flag = pattern.matcher(s).matches();
		
			if (flag) {
				return true;
			} else
				return false;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mobileValidation("123-456-7654"));
		System.out.println(mobileValidation("(123)456-7654"));
		System.out.println(mobileValidation("(123)4567654"));
		
	}

}
