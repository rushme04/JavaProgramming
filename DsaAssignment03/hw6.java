package DsaAssignment03;

public class hw6 {
	public static boolean isPalindrome(String s) {
		if(s.length()<=1)
			return true;
		if(s.charAt(0)!=s.charAt(s.length()-1))
			return false;
		
		return isPalindrome(s.substring(1,s.length()-1));
	}

	public static void main(String[] args) {
		String s= "racecar";
		System.out.println(isPalindrome(s));

	}

}
