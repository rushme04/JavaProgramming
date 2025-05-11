package DsaAssignment01;
import java.util.Scanner;
public class q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of rows and columns of 2D Array: ");
		int rows=sc.nextInt();
		int columns= sc.nextInt();
		int[][]arr= new int[rows][columns];
		System.out.println("Enter elements of array: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j]= sc.nextInt();
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int sum=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				sum+=arr[i][j];
			}
		}
		System.out.println("SUM: "+sum);

	}

}
