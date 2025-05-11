package DsaAssignment01;
import java.util.Scanner;
public class q2 {
	public static double calcBMI(double w, double h) {
		return w/(h*h);
	}
	public static String type(double bmi) {
		if(bmi<18.5)
			return "Underweight";
		else if(bmi>=18.5 && bmi<25)
			return "Normal weight";
		else if(bmi>=25 && bmi<30)
			return "Overweight";
		else
			return "Obese";
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter weight in kg: ");
		double w= sc.nextDouble();
		System.out.print("Enter height in meter: ");
		double h=sc.nextDouble();
		double bmi= calcBMI(w,h);
		String category= type(bmi);
		System.out.println("BMI: "+bmi);
		System.out.println("Type: "+category);


	}

}
