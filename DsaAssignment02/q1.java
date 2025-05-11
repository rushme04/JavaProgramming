package DsaAssignment02;
import java.util.Scanner;;
class car{
	String model;
	int year;
	void setDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter model: ");
		model= sc.next();
		System.out.println("Enter year: ");
		year= sc.nextInt();
		
	}
	void displayDetails() {
		System.out.println(model+" "+year);
	}
}

public class q1 {

public static void main(String[] args) {
		car one= new car();
		car two= new car();
		one.model= "Toyota";
		one.year= 2020;
		two.setDetails();
		one.displayDetails();
		two.displayDetails();
		 
		if(one.year>two.year) {
			System.out.println(one.model+" is newer.");
		}
		else {
			System.out.println(two.model+" is newer.");

		}

	}

}
