package DsaAssignment03;
import java.util.*;
public class q7 {

	public static int fact (int n) {
		if(n==0) {
			return 1;
		}
		return (n * fact(n-1));
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter a Integer: ");
		int x = in.nextInt();
		System.out.println("Factorial of "+x+" is: "+fact(x));
		

	}

}
