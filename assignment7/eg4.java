package assignment7;
import java.util.Scanner;
public class eg4 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the size of the first array: ");
	int a=sc.nextInt();
	int arr1[]= new int[a];
	System.out.print("Enter elements of the first array: ");
	for(int i=0;i<arr1.length;i++) {
		arr1[i]=sc.nextInt();
	}
	System.out.print("Enter the size of the second array: ");
	int b= sc.nextInt();
	int arr2[]=new int[b];
	System.out.print("Enter the elements of the second array: ");
	for(int i=0;i<arr2.length;i++) {
		arr2[i]=sc.nextInt();
	}
	int arr3[]= new int[a];
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr2.length;j++) {
			if(arr1[i]==arr2[j]) {
				arr3[i]= arr1[i];
			}
		}
	}
	System.out.print("Common Elements are: ");
	for(int i=0;i<arr3.length;i++) {
		if(arr3[i]!=0) {
			System.out.print(arr3[i]+" ");
		}
	}
	}

}
