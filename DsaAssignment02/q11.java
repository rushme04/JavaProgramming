package DsaAssignment02;
import java.util.*;

class Student {

    int roll;
    String name;
    int mark;

    void getData() {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter DSA Marks: ");
        mark = sc.nextInt();
    }

    void showData() {
        System.out.println("Roll no : " +roll);
        System.out.println("Enter name : " +name);
        System.out.println("Mark : " +mark);
    }
    
}

public class q11 {

    public static void main(String[] args) {
        Student []students=new Student[5];
        int highest=0;
        for(int i=0;i<5;i++) {
        	students[i]=new Student();
        	System.out.println("Enter details for student"+(i+1)+": ");
        	students[i].getData();
        	if(students[i].mark>highest) {
        		highest=students[i].mark;
        	}
        }
        System.out.println("\nStudent with highest DSA Marks: ");
        for(Student x:students) {
        	if(x.mark==highest) {
        		x.showData();
        	}
        }
    }

}

