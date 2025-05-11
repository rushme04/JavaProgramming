package DsaAssignment01;
import java.util.Scanner;
public class haq1 {
	public static boolean checkformula(int a,int b,int c) {
		if(a+b==c) 
			return true;
		
		else if(a-b==c) 
			return true;
		
		else if(a*b==c) 
			return true;
		
		else if(a==b-c) 
			return true;
		
		else if(a==b+c) 
			return true;
		
		else if(a==b*c) 
			return true;
		
		else if(b==a*c) 
			return true;
		
		else 
			return false;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter integer a: ");
		int a=sc.nextInt();
		System.out.print("Enter integer b: ");
		int b=sc.nextInt();
		System.out.print("Enter integer c: ");
		int c=sc.nextInt();
		if(checkformula(a,b,c)) {
			System.out.println("The integers can be used in correct arrithmetic formula.");
		}
		else {
			System.out.println("The integers can not be used in correct arrithmetic formula.");
		}

	}

}
