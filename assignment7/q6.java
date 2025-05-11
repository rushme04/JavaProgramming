package assignment7;

public class q6 {
    public static void reverseArray(int[]array) {
    	int i=0;
    	int j=array.length-1;
    	while(i<j) {
    		int temp=array[i];
    		array[i]=array[j];
    		array[j]=temp;
    		i++;j--;
    	}
    }
    public static void printArray(int[]array) {
    	for(int i=0;i<array.length;i++) {
    		System.out.print(array[i]+" ");
    	}
    	System.out.println();
    }
	public static void main(String[] args) {
		int[]array= {10,-20,-3,40,5};
		System.out.print("Original array: ");
		printArray(array);
		reverseArray(array);
		System.out.print("Reversed array: ");
		printArray(array);
		
	}

}
