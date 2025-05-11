package assignment6;
import java.util.Scanner;
public class q1 {
public static int add(int x, int y) {
	int z;
	z=x+y;
	return z;
}
public static int subtract(int x, int y) {
	int z=y-x;
	
	return z;
}
public static int multiply(int x, int y) {
	int z= x*y;
	return z;
}
public static double division(int x, int y) {
	double z= y/x;
	if(x==0) {
		return Double.NaN;
	}
	return z;
}
public static int remainder(int n, int  m) {
	int z=n%m;
	return z;
}
public static double squareRoot(int n) {
	
	if(n<0) {
		return Double.NaN;
	}
	return Math.sqrt(n);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose an operation:\n"+"1.Addition\n"+"2.Subtraction\n"+"3.Multiplication\n"+"4.Division\n"+"5.Remainder\n"+"6.Square-Root");
		int choice=sc.nextInt();
		int a,b;
	    double result=0;
	    switch(choice) {
	    case 1:
	    	System.out.print("Enter the first number: ");
	    	a=sc.nextInt();
	    	System.out.print("Enter the second number: ");
	    	b=sc.nextInt();
	    	result=add(a,b);
	    break;
	    case 2: 
	    	System.out.print("Enter the first number: ");
	    	a=sc.nextInt();
	    	System.out.print("Enter the second number: ");
	    	b=sc.nextInt();
	    	result=subtract(a,b);
	    break;
	    case 3: 
	    	System.out.print("Enter the first number: ");
	    	a=sc.nextInt();
	    	System.out.print("Enter the second number: ");
	    	b=sc.nextInt();
	    	result=multiply(a,b);
	    break;
	    case 4: 
	    	System.out.print("Enter the first number: ");
	    	 a=sc.nextInt();
	    	System.out.print("Enter the second number: ");
	    	 b=sc.nextInt();
	    	result=division(a,b);
	    break;
	    case 5: 
	    	System.out.print("Enter the first number: ");
	    	 a=sc.nextInt();
	    	System.out.print("Enter the second number: ");
	    	 b=sc.nextInt();
	    	result=remainder(a,b);
	    break;
	    case 6:
	    	System.out.print("Enter the number: ");
	    	a=sc.nextInt();
	    	result=squareRoot(a);
	    	break;
	    
	    }
	    if(choice>=1 && choice <=6) {
	    	System.out.println("Result: "+result);
	}
	}

}
