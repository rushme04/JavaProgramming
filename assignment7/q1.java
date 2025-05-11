package assignment7;
import java.util.Scanner;
import java.util.Random;
public class q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = sc.nextInt();
		int[] array=new int[N];
		Random random=new Random();
		int sum=0;
		System.out.println("Array: ");
		for(int i=0;i<N;i++) {
			array[i]= random.nextInt(100)+1;
			System.out.print(array[i]+" ");
			sum+=array[i];
		}

		double average= (double)sum/N;
		
		
		System.out.println("\nSum: "+sum);
		System.out.println("Average: "+average);

	}

}
