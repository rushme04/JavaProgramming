package assignment6;
import java.util.Scanner;
public class q7 {
public static int count(String str) {
	int vowel=0;
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			vowel++;
			}
	}
	return vowel;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a word: ");
		String a=sc.nextLine();
		int vowel= count(a);
		System.out.println("The word "+a+" has "+vowel+" vowels.");
		

	}

}
