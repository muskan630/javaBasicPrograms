import java.util.Scanner;
public class PrimeNumChecker {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Prime number checker : ");
		System.out.print("Enter a number that you want to check whether it's a prime number or not :  ");
		int num = input.nextInt();
	
		boolean primenum = isprime(num);
		
		if(primenum) {
			System.out.println("Your number is prime ");
		}
		else {
			System.out.println("Your number is not prime ");
		}
		System.out.println("Thank You !");
	}
	public static boolean isprime(int num) {
		int i = 2;
		while(i<num) {
			if (num % i == 0 ) {
				return false;
			} 
			i++;
		}
		
		return true;
	}
}
