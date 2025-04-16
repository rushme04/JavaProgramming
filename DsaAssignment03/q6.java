package DsaAssignment03;

public class q6 {

	public static <T> int count (T[] array, T item) {
		int cnt=0;
		for(T num:array) {
			if (num==item) {
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Integer a[] = {1,3,5,1,9};
		String b[] = {"yo", "whats","good","yo"};
		Character c[] = {'a','b','c', 'a', 'a'};

		System.out.println(count(a, 1)+ " times");
		System.out.println(count(b,"yo")+ " times");
		System.out.println(count(c,'a')+ " times");
		

	}

}
