package DsaAssignment01;
import java.util.Scanner;
public class q3 {
	public static boolean isSpy(int n) {
		int sum=0;
		int product=1;
		while(n!=0) {
			int digit= n%10;
			sum+=digit;
			product*=digit;
			n/=10;
		}
		return sum==product;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		if(isSpy(n)) {
			System.out.println(n+" is a spy number.");
		}
		else {
			System.out.println(n+" is not a spy number.");
		}
	}

}
