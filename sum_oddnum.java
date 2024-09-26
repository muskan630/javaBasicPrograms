import java.util.Scanner;
public class sum_oddnum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to sum of odd no. calculator !");
		int count = num_times(input);
		int sum = 0;
		int i = 0;
		while(i<count) {
			System.out.print("Please Enter the odd number : ");
			int odd_num = input.nextInt();
			if(odd_num % 2 == 1) {
				sum+= odd_num;
			}
			else {
				System.out.println("Ohh ! You entered the wrong number. Please enter odd number");
			}
		    i++;                                                                                                                                
		}
		System.out.println("The sum of all odd number entered is : " + sum);
		System.out.println("Thank You !");
		
	}
	public static int num_times(Scanner input) {
		System.out.print("How many odd numbers do u want to add ? ");
		return input.nextInt();
	}
}
  