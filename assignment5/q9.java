package assignment5;
import java.util.Scanner;
public class q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n=sc.nextInt();
		double sum=0;
		for(int i=1;i<=n;i++) {
			sum+=1.0/(i*i);
		}
		System.out.printf("The sum of the series is %.5f%n",sum);

	}

}
