package StringPrograms20;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="Nazeeya";
		String str2="Nazeeya";
		String str3= new String("Nazeeya");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println("*************");
		str2= str2+"";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println("*************");
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		System.out.println("*************");
		System.out.println(str2==str3);
		System.out.println(str2.equals(str3));

	}

}
