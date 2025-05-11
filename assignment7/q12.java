package assignment7;
import java.util.Scanner;
public class q12 {
    public static void selectionSort(int[]arr) {
    	int n=arr.length;
    	for(int i=0;i<n-1;i++) {
    		int minIndex=i;
    	for(int j=i+1;j<n;j++) {
    		if(arr[j]<arr[minIndex]) {
    			minIndex=j;
    		}
    	}
    	if(minIndex!=i) {
    		int temp=arr[i];
    		arr[i]=arr[minIndex];
    		arr[minIndex]=temp;
    	   }
    	}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]numbers= new int[10];
		System.out.println("Enter 10 integer numbers: ");
		for(int i=0;i<10;i++) {
			numbers[i]=sc.nextInt();
		}
		selectionSort(numbers);
		System.out.println("Sorted numbers: ");
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
		
	}

}
