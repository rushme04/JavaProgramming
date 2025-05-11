package assignment7;
import java.util.Scanner;
public class q5 {
  public static int secondLargest(int[]array) {
	  if(array.length<2) {
		  throw new IllegalArgumentException("Array must have atleat two elements");
	  }
	  int largest=Integer.MIN_VALUE;
	  int secondLargest=Integer.MIN_VALUE;
	  for(int i=0;i<array.length;i++) {
		  if(array[i]>largest) {
			  secondLargest=largest;
			  largest=array[i];
		  }
		  else if(array[i]>secondLargest && array[i]<largest) {
			  secondLargest=array[i];
		  }
	  }
	  return secondLargest;
  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n=sc.nextInt();
		if(n<2) {
			System.out.println("There must be atleast two elements in the array.");
			return;
		}
		int[]array=new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		int secondLargestValue =secondLargest(array);
		System.out.println("The second largest value is: "+secondLargestValue);

	}

}
