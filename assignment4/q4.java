package assignment4;
import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter 1st Number: ");
		int x = in.nextInt();
		System.out.print("Enter 2nd Number: ");
		int y = in.nextInt();
		int temp = 0;
		if (x==y) {
			System.out.println("GCD of x and y is " + y);
		}
		else {
			while(y!=0) {
				temp = y;
				y = x % y;
				x = temp;
			}
			System.out.println("GCD of x and y is " + x);
		}
			
	}

}
