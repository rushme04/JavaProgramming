package assignment6;

import java.util.Scanner;
public class q3 {
   public static int reverse(int num) {
	   int rev=0;
	   while(num!=0) {
		   int rem=num%10;
		   rev=rev*10+rem;
		   
		   num/=10;
	   }
	   return rev;
   }
   public static boolean isPalindrome(int num) {
	   return num==reverse(num);
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a=sc.nextInt();
		
		if(isPalindrome(a)) {
			System.out.println(a+" is  a palindrome number.");
		}
		else {
			System.out.println(a+" is not a palindrome number.");
		}
	}

}
