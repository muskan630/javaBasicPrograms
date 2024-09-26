import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to Fibonaci Series ! ");
		System.out.print("Please enter the number up to which series has to be printed - ");
		int num = input.nextInt();
		System.out.println("Here the list of Fibonacci Series -");
		fibonacci_series(num);
	}
	public static void fibonacci_series(int num) {
		if(num<0) {
			System.out.println("0");
		}
		else if (num==0) {
			System.out.println("0");
		}
		else {
			int firstnum=0 , secondnum=1;
			System.out.print(firstnum + " ");
			System.out.print(secondnum +" ");
			while(firstnum+secondnum <=num) {
				int thirdnum =firstnum + secondnum;
				System.out.print( thirdnum +" " );
				firstnum =secondnum ;
				secondnum =thirdnum;
			}
		}
	}
}
