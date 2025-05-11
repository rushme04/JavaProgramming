package assignment4;
import java.util.Scanner;
public class q10 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number: ");
     int n=sc.nextInt();
     int p=1;
     while(p*3<=n) {
    	 p=p*3;
     }
     System.out.println("The largest power of 3 less than or equal to "+n+" is "+p);
	}

}
