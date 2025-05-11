package assignment7;

import java.util.Scanner;
public class eg2 {
    public static double max(double[]array) {
    	double maxvalue= array[0];
    	
    	for(int i=1;i<array.length;i++) {
    		if(array[i]>maxvalue) {
    			maxvalue=array[i];
    		}
    		
    	}
    	
    	return maxvalue;
    }
    	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size: ");
		int x = sc.nextInt();
		double[]numbers=new double[x];
		System.out.println("Enter " + x + " numbers: ");
		for(int i=0;i<x;i++) {
			numbers[i]=sc.nextDouble();
			
		}
		double maxvalue=max(numbers);
		System.out.println("The maximum number is: "+maxvalue);

	}

}


