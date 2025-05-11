	package DsaAssignment01;
import java.util.Scanner;
public class q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements of Array: ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.print("Enter elements of the array: ");
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		int max= arr[0];
		int min= arr[0];
		int maxCount=0;
		int minCount=0;
		int maxFirstOccur= -1;
		int minLastOccur= -1;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max= arr[i];
			}
			if(arr[i]<min) {
				min= arr[i];
			}}
		for(int i=0;i<n;i++) {
			if(arr[i]==max) {
				maxCount++;
			if(maxFirstOccur ==-1) {
				maxFirstOccur=i+1;
			}}
			if(arr[i]==min) {
				minCount++;
				minLastOccur=i+1;
			}
		}
		System.out.println(max);
		System.out.println(maxCount);
		System.out.println(maxFirstOccur);
		System.out.println(min);
		System.out.println(minCount);
		System.out.println(minLastOccur);
                       
	}

}

