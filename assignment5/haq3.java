package assignment5;
import java.util.Scanner;
public class haq3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		double x=sc.nextDouble();
		double t=x,sum=0;
		int i=1;
		do {
			sum+=t;
			i+=2;
			t=-t*x*x/(i*(i-1));
		}while(Math.abs(t)>0.000001);
		System.out.println(sum);

	}

}
