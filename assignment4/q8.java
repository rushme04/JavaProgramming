package assignment4;
import java.util.Scanner;
public class q8 {

	public static void main(String[] args) {
     Scanner in = new Scanner (System.in);
		
		while (true) {
			System.out.print("Enter Your Guess: ");
			int a = in.nextInt();
			int b = (int) (Math.random() * (10-1)+1);
			System.out.println("Computer Guess: " + b);
			
			
			if (a>b) {
				System.out.println("TOO HIGH, try again");
			}
			else if (b>a) {
				System.out.println("TOO LOW, try again");
			}
			else {
				System.out.println("correct guess");
				break;
			}
		}

	}

}
