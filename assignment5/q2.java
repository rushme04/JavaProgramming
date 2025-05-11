package assignment5;
import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n=sc.nextInt();
	int rev=0;
 int temp=n;
	while(n!=0) {
		int rem=n%10;
		rev=rev*10+rem;
		n/=10;
	}
	int flag=0;
	for(int i=2;i<rev/2;i++) {
		if(rev%i==0) {
			flag=1;
			break;
		}
	}
    if(flag==0) {
    	System.out.println(temp+" is a twisted prime.");
    }
    else {
    	System.out.println(temp+" is not a twisted prime.");
    }
	}

}
