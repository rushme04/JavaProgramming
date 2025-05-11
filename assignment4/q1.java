package assignment4;
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner (System.in);
		System.out.print("enter 1st number: ");
		int a = inp.nextInt();
		System.out.print("enter 2nd number: ");
		int b = inp.nextInt();
		System.out.print("enter 3rd number: ");
		int c = inp.nextInt();
		int sum=0;
//		int cnt=0;
		System.out.print("numbers are: ");
		for(int i = a; i<=b; i = i+c) {
			System.out.print(" "+i);
//			cnt++;
	       sum+=i;
		}
		System.out.println();
		System.out.println("The sum of number displayed is "+sum);
//		System.out.println(cnt);
}
}