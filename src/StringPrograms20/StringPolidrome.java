package StringPrograms20;

import java.util.Scanner;

public class StringPolidrome {
	
	public static boolean isPolidrome(String str) {
		String Polindrome = "";
		for(int i= str.length()-1;i>=0;i--){
			Polindrome = Polindrome+str.charAt(i);
		}
		if(str.equals(Polindrome)) {
			return true;
		}
		else 
			return false;
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String input = sc.next();
		boolean flag = isPolidrome(input);
		if(flag) {
			System.out.println("Given String" +input+ "is Polidrome");
		}
		else
			System.out.println("Given String" +input+ "is not Polidrome");
			
	}

}
