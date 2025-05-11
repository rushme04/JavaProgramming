package DsaAssignment01;
import java.util.Scanner;
public class q6 {
	public static boolean isOdd(int n) {
		while(n>0) {
			n=n-2;
		}
		return n!=0;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number: ");
		int n=sc.nextInt();
		if(isOdd(n)) {
			System.out.println(n+" is an odd number.");
		}
		else {
			System.out.println(n+" is  not an odd number.");
		}

	}

}
