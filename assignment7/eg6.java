package assignment7;
import java.util.Scanner;
public class eg6 {//insertion

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n=sc.nextInt();
		int arr[]= new int[n+1];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.print("Enter the position to insert: ");
		int pos= sc.nextInt();
		System.out.print("Enter the element to insert: ");
		int value= sc.nextInt();
		for(int i=n;i>=pos;i--) {
			arr[i]= arr[i-1];
		}
		arr[pos-1]= value;
		n++;
		System.out.println("Array after insertion: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
