package assignment6;
import java.util.Scanner;
public class q9 {
public static boolean isValidPassword(String password) {
	if(password.length()<8) {
		return false;
	}
	for(int i=0;i<password.length();i++) {
		char c=password.charAt(i);
		if(!Character.isLetterOrDigit(c)) {
			return false;
		}
	}
	int digitCount =0;
	for(int i=0;i<password.length();i++) {
		char c=password.charAt(i);
		if(Character.isDigit(c)) {
			digitCount++;
			
		}
	}
	return digitCount>=2;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter password: ");
		String password =sc.nextLine();
		if(isValidPassword(password)) {
			System.out.println("Valid Password.");
		}
		else {
			System.out.println("Invalid Password.");
		}

	}

}
