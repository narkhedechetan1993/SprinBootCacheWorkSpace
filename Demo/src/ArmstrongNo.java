
public class ArmstrongNo {

	public static void main(String[] args) {
		
		int no = 121;
		int no1=no;
		int sum=0;
		
		while(no!=0) {
			int tmp = no%10;
			sum = sum + (tmp*tmp*tmp);
			no=no/10;
		}
		
		if(sum==no1){
			System.out.println(no1 + " is armstrong no....");
		}
		else {
			System.out.println(no1 + " is not armstrong no...");
		}
	}

}
