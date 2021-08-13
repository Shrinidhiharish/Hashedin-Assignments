package java_DayOne_Assignments;

public class Palindrome_Runner extends Palindrome_Check {
	

	public static void main(String[] args) {
		System.out.println("Enter the string or number to check for palidrome");
		Palindrome_Runner obj = new Palindrome_Runner();
		obj.isPalindrome(obj.original);
		//object creation demo and here the child class object is calling the parent class method.
		
	}
}
