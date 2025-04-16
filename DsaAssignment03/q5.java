package DsaAssignment03;

public class q5 {
	public static<E>void printarray(E[]inputarray){
		for(E element:inputarray) {
			System.out.print(element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[]a= {1,2,3,4};
		String[]b= {"fuck ","you"};
		Character[]c= {'r','a','s','h','m','i'};
		printarray(a);
		printarray(b);
		printarray(c);

	}

}
