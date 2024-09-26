import java.util.Scanner;
public class ReverseDigitCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Calculator that Reverse your digit ! ");
		System.out.print("Please Enter a number : ");
		int number = input.nextInt();
		int num = number;
		int newNum =0;
		while(num>0) {
			int lst_digit = num % 10;
			newNum = newNum * 10 +lst_digit;
			num /= 10;
		
		}
		
		System.out.println("Your " +number + " number is reversed." + " The reversed number is " + newNum);

	}

}
