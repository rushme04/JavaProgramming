package assignment6;
import java.util.Scanner;
public class q10 {
public static double area(double radius) {
	double areaOfCircle= Math.PI*radius*radius;
	return areaOfCircle;
}
public static double area(double base, double height) {
	double areaOfTriangle= (1.0/2)*base*height;
	return areaOfTriangle;
}
public static double area(float side) {
	double areaOfSquare= side*side;
	return areaOfSquare;
}
public static double area(float length,float breadth) {
	double areaOfRectangle=length*breadth;
	return areaOfRectangle;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose an operation:\n"+"1.Area of Circle\n"+"2.Area of Triangle\n"+"3.Area of Square\n"+"4.Area of Rectangle");
		int choice=sc.nextInt();
		double a,b;
		float c,d;
		double result=0;
		switch (choice) {
		case 1:
			System.out.print("Enter the Radius: ");
			a=sc.nextDouble();
			result= area(a);
			break;
		case 2:
			System.out.print("Enter the base of the Triangle: ");
			a=sc.nextDouble();
			System.out.print
			("Enter the height of the Triangle: ");
			b=sc.nextDouble();
			result= area(a,b);
			break;
		case 3:
			System.out.print("Enter the side of a Square: ");
			c=sc.nextFloat();
			result= area(c);
			break;
		case 4:
			System.out.print("Enter the length of the Rectangle: ");
			c=sc.nextFloat();
			System.out.print("Enter the breadth of the Rectangle: ");
			d=sc.nextFloat();
			result= area(c,d);
			break;
			
		}
		if(choice>=1 && choice<=4) {
			System.out.println("Area is: "+result);
		}
		}

	}


