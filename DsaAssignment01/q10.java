package DsaAssignment01;
import java.util.Scanner;
public class q10 {
	public static double sumColumn(double[][]m,int columnIndex) {
		double sum=0;
		for(int i=0;i<m.length;i++) {
			sum+=m[i][columnIndex];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[][]arr= new double[3][4];
		System.out.println("Enter elements: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				arr[i][j]= sc.nextDouble();
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int j=0;j<4;j++) {
			double sum= sumColumn(arr,j);
			System.out.println("Sum of the elements at column "+j+" is "+sum);
		}

	}

}
