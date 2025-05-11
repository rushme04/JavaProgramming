package assignment5;
import java.util.Scanner;
public class haq5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int n=sc.nextInt();
		System.out.println("The sequence is: ");
		int a=0,b=1,c=1;
		System.out.print(a+" "+b+" "+c+" ");
		for(int i=4;i<=n;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(c+" ");
		}

	}

}
