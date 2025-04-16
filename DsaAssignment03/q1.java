package DsaAssignment03;
import java.util.Scanner;

class NumberFormatException extends Exception{
	NumberFormatException(String msg){
		super(msg);
	}
}

	public class q1 {
	public static void check (int a) throws NumberFormatException {
		if(a<0) {
			throw new NumberFormatException ("Negative Number Are Not Allowed");
		}
		
		else {
			System.out.println("Your Lucky Number is "+a);
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a lucky number: ");
		int x = in.nextInt();
		
		try {
			check(x);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Try Again");
			in.close();
		}

	}

}
