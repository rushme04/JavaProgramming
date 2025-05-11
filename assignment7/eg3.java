package assignment7;
import java.util.*;
public class eg3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.print("Enter the length of the array: ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.print("Enter " + n + " values: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.print("Odd values are: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				sum+=arr[i];
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Sum: "+sum);

	}

}
