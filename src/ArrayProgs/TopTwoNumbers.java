package ArrayProgs;

public class TopTwoNumbers {
	public static void topTwoNumbers(int[] array) {
		
		int max1=Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int num: array) {
			if(num>max1) {
				max2=max1;
				max1= num;
			}
			else if(num > max2){
				max2=num;
			}
		}
		System.out.println("Max1 value "+max1);
		System.out.println("Max2 value "+max2);
	}

	public static void main(String[] args) {
	int[] a= { 11,22,15,34,25};
	topTwoNumbers(a);

	}

}
