package DsaAssignment01;
import java.util.Scanner;
public class haq4 {
	public static double[][] addMatrix(double[][]a, double[][]b){
		int rows= a.length;
		int cols= a[0].length;
		double[][]result= new double[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				result[i][j]= a[i][j]+b[i][j];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows and columns of matrix A and B: ");
		int rows=sc.nextInt();
		int cols= sc.nextInt();
		double[][]a= new double[rows][cols];
		double[][]b= new double[rows][cols];
		System.out.println("Enter elements of matrix A: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				a[i][j]=sc.nextDouble();
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter elements of matrix B: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				b[i][j]=sc.nextDouble();
				System.out.print(b[i][j]+" ");

			}
			System.out.println();
		}
		System.out.println("Addition of matrix A and B gives us: ");
		double[][]c= addMatrix(a,b);
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
