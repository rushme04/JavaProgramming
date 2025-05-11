package assignment5;
import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Enter the value of m: ");
		int m=sc.nextInt();
		System.out.print("Enter the value of n: ");
		int n=sc.nextInt();
		
		for(int i=m;i<=n;i++) {
			int p=1;
		    for(int j=1;j<=i;j++) {
		    	p*=j;
		    }
		    System.out.println("Factorial of " +i+" is "+p);
		}
	    

	}

}
