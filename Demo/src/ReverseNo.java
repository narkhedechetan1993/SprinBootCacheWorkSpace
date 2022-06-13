
public class ReverseNo {

	public static void main(String[] args) {
		
		int num = 12345;
		int rev=0;
		
		System.out.println("Original no = " + num);
		
		while(num != 0) {
			rev=rev*10+(num%10);
			num=num/10;
		}
		

		System.out.println("Reverse no = " + rev);
	}

}
