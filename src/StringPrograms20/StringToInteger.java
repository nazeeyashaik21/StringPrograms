package StringPrograms20;

import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {

Scanner sc= new Scanner(System.in);
String str = sc.next();
int num = sc.nextInt();

Integer strconv = Integer.parseInt(str);
System.out.println(strconv);


String numconv = Integer.toString(num);
System.out.println(numconv);
System.out.println(strconv=strconv+1);
System.out.println(numconv=numconv+"nazeeya");
	}

}
