package assignment7;
import java.util.Scanner;
public class q10 {
    public static int[] eliminateDuplicates(int[]list) {
    	int uniqueCount=0;
    	for(int i=0;i<list.length;i++) {
    		boolean Duplicate= false;
    		for(int j=0;j<uniqueCount;j++) {
    			if(list[i]==list[j]) {
    				Duplicate= true;
    				break;
    			}}
    			if(!Duplicate) {
    				list[uniqueCount]=list[i];
    				uniqueCount++;
    				}
    		}
    	int result[]= new int[uniqueCount];
    	for(int i=0;i<uniqueCount;i++) {
    		result[i]= list[i];
    	}
    	return result;
    	}
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n=sc.nextInt();
		int[]numbers=new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++) {
			numbers[i]=sc.nextInt();
		}
	int []distinctNumbers= eliminateDuplicates(numbers);
		System.out.print("The distinct numbers are: ");
		for(int i=0;i<distinctNumbers.length;i++) {
			System.out.print(distinctNumbers[i]+" ");
		}

	}

}
