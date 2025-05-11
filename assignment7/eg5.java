package assignment7;
import java.util.Scanner;
public class eg5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int a=sc.nextInt();
		int arr1[]= new int[a];
		int arr2[]= new int[a];
		
		System.out.println("Before swapping: ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<arr1.length;i+=2) {
			arr2[i]=arr1[i+1];
			arr2[i+1]=arr1[i];
		}
		System.out.println("After swapping: ");
		for(int i:arr2) {
			System.out.print(i+" ");
		}

	}

}
