package DsaAssignment01;
import java.util.Scanner;
public class q5 {
	public static int sum_Of_Digits(int n) {
		int sum=0;
		while(n!=0) {
			int digits= n%10;
			sum+=digits;
			n/=10;
		}
		if (sum>9) {
			sum=sum_Of_Digits(sum);
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int sum= sum_Of_Digits(n);
		System.out.println("SUM: "+sum);

	}

}
