package DsaAssignment03;

public class hw2 {
	public static int binarySearch(int[]arr,int first,int last,int key) {
		int mid= (first+last)/2;
		if(first==last) {
			if(arr[first]==key)
				return first;
			else
				return -1;
		}
		else {
			if(arr[mid]<key) 
				return binarySearch(arr,mid+1,last,key);
			else if(arr[mid]==key)
				return mid;
			else
				return binarySearch(arr,first,mid-1,key);
				
			
		}
	}

	public static void main(String[] args) {
		int[]arr= {2,4,6,8,10,12,14,16};
		int key=8;
		System.out.println(binarySearch(arr,0,arr.length-1,key));

		

	}

}
