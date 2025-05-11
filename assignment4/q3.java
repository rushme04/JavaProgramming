package assignment4;
import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter a Number: ");
		int n = in.nextInt();
	    int cnt = 0;
	    int sum = 0;
	    double avg = 0;
	    System.out.println("Random Number Generated are");
	    do {
	    	int rdmnum = (int) ((Math.random()* (n-1)) +1);
	    System.out.print(rdmnum +" ");
	    sum= sum + rdmnum;
	    cnt++;
	    } while (cnt<n);
	    avg = (double) sum/n;
	     System.out.println("\nAverage of " + n + " number is: " +avg);	

	}

}
