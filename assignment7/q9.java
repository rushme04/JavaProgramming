package assignment7;
import java.util.Scanner;
public class q9 {
    public static double mean(double[]x) {
    	double sum=0;
    	for(int i=0;i<x.length;i++) {
    		sum+=x[i];
    	}
    	return sum/x.length;
    }
    public static double deviation(double[]x,double mean) {
    	double sum=0;
    	for(int i=0;i<x.length;i++) {
    		sum+=Math.pow(x[i]-mean, 2);
    	}
    	return Math.sqrt(sum/(x.length-1));
    	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[]numbers=new double[10];
		System.out.println("Enter ten numbers: ");
		for(int i=0;i<10;i++) {
			numbers[i]=sc.nextDouble();
		}
		double meanValue= mean(numbers);
		double stdDeviation= deviation(numbers,meanValue);
		System.out.printf("The mean is %.2f%n",meanValue);
		System.out.printf("The standard deviation is %.5f%n",stdDeviation);

	}

}
