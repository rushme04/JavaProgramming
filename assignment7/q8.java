package assignment7;
import java.util.Scanner;
public class q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]array=null;
		int n=0;
		while(true) {
			System.out.println("\nMenu:");
			System.out.println("1.Create an array of N integers");
			System.out.println("2. Display the array elements ");
			System.out.println("3.Insert an element at a specific position");
			System.out.println("4.Delete an element at a given position");
			System.out.println("5.Exit");
			System.out.print("Enter your choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter the number of elements in the array: ");
				n=sc.nextInt();
				array=new int[n];
				System.out.println("Enter the elements: ");
				for(int i=0;i<n;i++) {
					array[i]=sc.nextInt();
				}
				break;
			case 2:
				if(array==null) {
					System.out.println("Array is not created yet.");
				}
				else {
					System.out.println("Array elements: ");
					for(int i=0;i<array.length;i++) {
						System.out.print(array[i]+" ");
					}
					System.out.println();
				}
				break;
			case 3:
				if(array==null) {
					System.out.println("Array is not created yet.");
				}
				else {
					System.out.print("Enter the position to insert (1 to "+(n)+"): ");
					int pos=sc.nextInt();
					int index = pos-1;
					if(index<0||index>n) {
						System.out.println("Invalid position.");
					}
					else {
						System.out.print("Enter the element to insert: ");
						int element=sc.nextInt();
						int[]newArray=new int[n+1];
						for(int i=0,j=0;i<newArray.length;i++) {
							if(i==index) {
								newArray[i]=element;
							}
							else {
								newArray[i]=array[j++];
							}
						}
						array=newArray;
						n++;
						System.out.println("Element inserted successfully.");
						
					}
				}
				break;
			case 4:
				if(array==null) {
					System.out.println("Array is not created yet.");
				}
				else {
					System.out.print("Enter the position to delete (1 to "+(n)+"): ");
					int posToDelete=sc.nextInt();
					int index= posToDelete-1;
					if(index<0||index>n) {
						System.out.println("Invalid position.");
					}
					else {
						for(int i=index;i<n-1;i++) {
							array[i]=array[i+1];
						}
						int[]newArray= new int[n-1];
//						
						for(int i = 0 ; i < newArray.length; i++) {
							newArray[i] = array[i];
						}
						System.out.println("Elements deleted successfully.");
						
						array=newArray;
						
					}
				}
				break;
			case 5:
				System.out.println("Existing the program.");
				System.exit(0);
				break;
				default:
					System.out.println("Invalid choice.Please try again.");
			}
		}
	}

}
