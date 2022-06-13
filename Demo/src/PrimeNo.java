
public class PrimeNo {

	public static void main(String[] args) {

//		int no = 59;

		for (int j = 1; j <= 100; j++) {

			boolean flag = true;

			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					flag = false;
					break;
				}
			}

			if (flag) {
				System.out.println(j + " is prime no");
			}
//			else {
//				System.out.println(j + " is not prime no");
//			}
		}
	}

}
