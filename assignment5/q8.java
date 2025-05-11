package assignment5;
import java.util.Scanner;
public class q8 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the value of n: ");
	int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			sum+=j;
		}
	}
	System.out.println("The sum of the series is "+sum);

	}

}
