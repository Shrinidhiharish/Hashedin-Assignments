package java_DayOne_Assignments;

public class Palindrome_Check extends Base{
	public String original = "";
	private String reverse = "";//making the class variable private so that it is accessible only for this class
	/*
	 * This is a method which takes any type of parameter to find if the
	 * value passed is palindrome or not
	 */
	
	public void isPalindrome(String word) {
		original = scan.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse))
			System.out.println("Entered string or the number is a palindrome.");
		else
			System.out.println("Entered string or the number is not a palindrome.");
	}
}
