
public class StarPattern {

	public static void main(String[] args) {
		pattern2(5);
		pattern1(5);
		
	}

//	*	*	*	*	*		
//		*	*	*
//			*
	public static void pattern2(int noOfRows) {
		// for rows
		for(int i = noOfRows; i>0; i--) {
			
			//for space
			for(int j=noOfRows; j > i; j--) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=(i*2)-1; k ++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
//				*
//			*	*	*
//		*	*	*	*	*
//	*	*	*	*	*	*	*
	public static void pattern1(int noOfRows) {
		// for rows
		for (int i = 1; i <= noOfRows; i++) {

			// For space
			for (int j = i; j < noOfRows; j++) {
				System.out.print(" ");
			}

			// for *
			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
