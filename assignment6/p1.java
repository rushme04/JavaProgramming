package assignment6;

public class p1 {
	public static String reverse(String str) {
		String reversed="";
		for(int i= str.length()-1;i>=0;i--) {
			reversed+=str.charAt(i);
		}
		return reversed;
	}
	public static boolean isPalindrome(String str) {
		String reversed= reverse(str);
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)!=reversed.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str="madam";
		boolean result= isPalindrome(str);
		System.out.println(result);

	}

}
