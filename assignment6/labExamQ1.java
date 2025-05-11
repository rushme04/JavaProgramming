package assignment6;
import java.util.Scanner;
public class labExamQ1 {
	public static void cpd(int a,int b) {
	for(int i=2;i<=a;i++) {
		if(a%i==0 && checkPrime(i)) {
		
		for(int j=2;j<=b;j++) {
			if(b%j==0 && checkPrime(j)) {
				
			}
			if(i==j) {
			
				System.out.print(i+" ");
			}
		}
		
		}}
	
	System.out.println();
	}
	public static boolean checkPrime(int c) {
		for(int i=2;i<=c/2;i++) {
			if(c%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a=sc.nextInt();
		System.out.print("Enter second number: ");
		int b=sc.nextInt();
		System.out.print("Common divisors: ");
		cpd(a,b);

	}

}
