package DsaAssignment01;
import java.util.Scanner;
public class haq3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the length of array a and b: ");
	int n= sc.nextInt();
	int []a= new int[n];
	int []b= new int[n];
	int []c= new int[n];
	System.out.println("Enter elements of array A: ");
	for(int i=0;i<n;i++) {
		a[i]= sc.nextInt();
	}
	System.out.println("Enter elements of array B: ");
	for(int i=0;i<n;i++) {
		b[i]=sc.nextInt();
	}
	System.out.println("Dot Product array: ");
	for(int i=0;i<n;i++) {
		c[i]=a[i]*b[i];
		System.out.print(c[i]+" ");
	}
	

	}

}
