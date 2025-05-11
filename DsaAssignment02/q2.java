package DsaAssignment02;
import java.util.Scanner;
class complex{
	int real;
	int imag;
	void setData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter real part: ");
		real= sc.nextInt();
		System.out.println("Enter imaginary part: ");
		imag= sc.nextInt();	
	}
	void display() {
		System.out.println(real+" + "+imag+"i.");
	}
	public complex add(complex c1,complex c2) {
		complex c3= new complex();
		c3.real= c1.real+c2.real;
		c3.imag= c1.imag+c2.imag;
		return c3;
	}
}

public class q2 {

	public static void main(String[] args) {
		complex one= new complex();
		one.setData();
		complex two= new complex();
		two.setData();
		complex three= new complex();
		three= three.add(one,two);
		one.display();
		two.display();
		three.display();

	}

}
