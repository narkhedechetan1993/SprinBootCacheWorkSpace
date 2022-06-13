
public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n1 = 0,n3 =0;
		int n2 = 1;
		
		int upTo = 10;
		
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=1; i<=upTo-2; i++) {
			n3 = n1+n2;
			n1=n2;
			n2=n3;
			
			System.out.println(n3);
		}
	}

}
