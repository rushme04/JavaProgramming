package assignment7;
import java.util.Scanner;
public class q4 {
    public static double min(double[]array) {
    	double minvalue= array[0];
    	for(int i=1;i<array.length;i++) {
    		if(array[i]<minvalue) {
    			minvalue=array[i];
    		}
    	}
    	return minvalue;
    }
    	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[]numbers=new double[10];
		System.out.println("Enter ten numbers: ");
		for(int i=0;i<10;i++) {
			numbers[i]=sc.nextDouble();
			
		}
		double minvalue=min(numbers);
		System.out.println("The minimum number is: "+minvalue);

	}

}
