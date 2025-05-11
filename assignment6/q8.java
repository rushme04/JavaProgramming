package assignment6;
import java.util.Scanner;
public class q8 {
public static boolean isPalindrome(String str) {
	int left=0;
	int right=str.length()-1;
	while(left<right) {
		if(str.charAt(left)!=str.charAt(right)) {
			return false;
		}
		left++;right--;
	}
	return true;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a word: ");
		String a=sc.nextLine();
		if(isPalindrome(a)) {
			System.out.println("The word "+a+" is Palindrome.");
		}
		else {
			System.out.println("The word "+a+" is not Palindrome.");
		}
		}

	}


