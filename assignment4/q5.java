package assignment4;
import java.util.Scanner;
public class q5 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("enter a number: ");
		int num = in.nextInt();
		int sum = 0;
		
		for (int i =1; i<=num/2; i++) {
			if(num%i==0) {
				sum = sum + i;
				
			}
		}
		if (sum==num){
		System.out.println(num + " is a perfect number");
		}
		else {
			System.out.println(num + " is not a perfect number");
		}

	}

}
