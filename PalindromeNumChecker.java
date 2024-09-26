import java.util.Scanner;
public class PalindromeNumChecker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Palindrome number checker !");
		System.out.print("Please enter a number - ");
		int num = input.nextInt();
		if (isPalindrome(num)) {
			System.out.println("Your number is palindrome. Thank You !");
		} else {
			System.out.println("Your number is not palindrome. ThankYou !");
		}
		
	}
	
	public static boolean isPalindrome(int num) {
		return num==reverse(num);
	}
	
	public static int reverse(int num) {
	int digit=0;
	while(num>0) {
		int lst_digit= num%10;
	    digit= digit*10+lst_digit;
		num/=10;
	}
	return digit;
	}
}
