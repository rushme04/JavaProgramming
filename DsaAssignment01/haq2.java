package DsaAssignment01;
import java.util.Scanner;
public class haq2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.print("Enter number of lines: ");
	int n=sc.nextInt();
	String[]lines= new String[n+1];
	System.out.println("Enter the lines: ");
	for(int i=0;i<lines.length;i++) {
		lines[i]= sc.nextLine();
	}
	System.out.println("By reversing it: ");
	for(int i=lines.length-1;i>0;i--) {
		System.out.println(lines[i]);
	}

	}

}
