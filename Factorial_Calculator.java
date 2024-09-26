import java.util.Scanner;
public class Factorial_Calculator {
	public static void main(String[] args) {
		System.out.println("Welcome to my  Factorial Calculator !");
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number that you want to find factorial of :  ");
		int num = input.nextInt();
		int i = num;
		long factorial = 1;
		while(i>0) {
			factorial *= i;
			i--;
		}
		System.out.println( "The Factorial of " + num +" is : "  + factorial );
	}
}
