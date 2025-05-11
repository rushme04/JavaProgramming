package assignment7;
import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[]array=new int[10];
	System.out.println("Enter ten integers: ");
	for(int i=0;i<10;i++) {
		array[i]=sc.nextInt();
	}
	System.out.print("Enter the number to search for: ");
	int searchNumber=sc.nextInt();
	int count=0;
	for(int i=0;i<10;i++) {
		if(array[i]==searchNumber) {
			count++;
		}
	}
	if(count>0) {
		String print= (count==1)?"time":"times";
		System.out.println(searchNumber+" occurs "+count+" "+print+" in the array.");
	}
	}

}
