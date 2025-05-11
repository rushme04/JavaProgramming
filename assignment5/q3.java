package assignment5;
import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a=sc.nextInt();
		System.out.print("Enter the second number: ");
		int b=sc.nextInt();
		System.out.println("Prime numbers between "+a+" and "+b+" are: ");
		for(int i=a;i<=b;i++) {
			int flag=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				
				System.out.print(i+" ");
			}
		}

	}

}
