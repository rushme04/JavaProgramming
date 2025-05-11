package assignment4;
import java.util.Scanner;
public class q9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer number: ");
        int input = scanner.nextInt();//102

        
        int result = 0;
        int place = 1;

        
        while (input != 0) {
            int digit = input % 10; 
            if (digit != 0) { 
            	int b= digit*place;
                result +=b; 
                place *= 10; 
            }
            input /= 10; 
        }

        
        System.out.println("After removing 0 from the number, the new number is " + result + ".");
	

	}

}
