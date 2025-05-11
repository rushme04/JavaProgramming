package assignment6;
import java.util.Scanner;
public class q5 {
public static double area(int n,double side) {
	return (n*side*side)/(4*Math.tan(Math.PI/n));
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the sides of a polygon: ");
		int a=sc.nextInt();
		System.out.print("Enter the length of the side: ");
		double b=sc.nextDouble();
		System.out.println("Area is: "+area(a,b)+" square unit.");

	}

}
