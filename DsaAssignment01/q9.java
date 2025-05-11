package DsaAssignment01;
import java.util.Scanner;
public class q9 {
	public static double sumMajorDiagonal(double[][]m) {
		double sum=0;
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m.length;j++) {
				if(i==j) {
					sum+=m[i][j];
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double arr[][]= new double[4][4];
		double sum=0;
		System.out.println("Enter array elements: ");
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				arr[i][j]= sc.nextDouble();
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sum= sumMajorDiagonal(arr);
		System.out.println("SUM: "+sum);

	}

}
