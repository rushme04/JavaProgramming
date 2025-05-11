package assignment4;
import java.util.Scanner;
public class q7 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter Number: ");
        int a = in.nextInt();
		int b = 10;
		
		System.out.println("Multiplication Table of " + a + " is ");
		
		
		for (int i = 1; i<= b ; i++) {
			
				System.out.println(a + "x" + i + "=" + (a*i) );
			
		}
	}

}
