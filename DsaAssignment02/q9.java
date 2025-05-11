package DsaAssignment02;
import java.util.Scanner;
class Employe{
	String name;
	int salary;
	Employe(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	void displayEmployeeInfo() {
		System.out.println(name+" \n"+salary);
	}
}
class manager extends Employe{
	String department;
	manager(String name,int salary,String department){
		super(name,salary);
		this.department=department;
	}
	void managerDetail() {
		super.displayEmployeeInfo();
		System.out.println(department);
	}
}

public class q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		manager[]arr= new manager[3];
		for(int i=0;i<3;i++) {
			System.out.println("Enter name: ");
			String name=sc.next();
			System.out.println("Enter salary: ");
			int salary=sc.nextInt();
			System.out.println("Enter department: ");
			String dept= sc.next();
			arr[i]= new manager(name,salary,dept);
			
			
		}
		for(int i=0;i<3;i++) {
			arr[i].managerDetail();
			System.out.println();
		}
		
	}

}
