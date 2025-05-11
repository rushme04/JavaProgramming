package assignment7;
import java.util.Scanner;
public class q7 {
    public static int[] decimalToOctal(int decimal) {
    	if(decimal==0) {
    		return new int[] {0};
    	}
    	int[]tempArray=new int[32];
    	int index=0;
    	while(decimal>0) {
    		tempArray[index]=decimal%8;
    		decimal/=8;
    		index++;
    	}
    	int[]octalArray= new int[index];
    	for(int i=0;i<index;i++) {
    		octalArray[i]=tempArray[index-1-i];
    	}
    	return octalArray;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int d=sc.nextInt();
		int[]octalArray= decimalToOctal(d);
		System.out.print("The octal representation is: ");
		for(int i=0;i<octalArray.length;i++) {
			System.out.print(octalArray[i]);
		}

	}

}
