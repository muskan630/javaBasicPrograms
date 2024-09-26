import java.util.Scanner;
public class sum_of_digit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Here, Performs Addition of digits of an integer !");
		System.out.print("Enter Your Number : ");
		long digit = input.nextLong();
		long result = sum(digit);
		System.out.println("The sum of digit you entered is " + result);
	}
	public static int sum(long digit) {
		int sum =0;
		while(digit > 0) {
			int lst_digit = (int)(digit % 10);
			sum= sum + lst_digit;
			digit /= 10;
			
		}
		return sum;
		
		
	}
}

