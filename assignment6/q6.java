package assignment6;
import java.util.Scanner;
public class q6 {
	public static int count(String str,char a) {
		int count=0;
//		String str = stry.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)== a) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a word: ");
		String a=sc.nextLine();
		System.out.print("Enter the letter: ");
		char b=sc.next().charAt(0);
		int count= count(a,b);
		System.out.println("The Letter '"+b+"' occurs "+count+" time in the word "+a+" .");
	}

}
