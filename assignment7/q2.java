package assignment7;
import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		int[]counts=new int[101];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integers between 1 and 100: ");
		while(true) {
			int num=sc.nextInt();
			if(num==0) {
				break;
			}
			if(num>=1 && num<=100) {
				counts[num]++;
			}
		}
		for(int i=1;i<counts.length;i++) {
			if(counts[i]>0) {
				String print= (counts[i]==1)?"time":"times";
				System.out.println(i+" occurs "+counts[i]+" "+print);
			}
		}
     
	}

}
