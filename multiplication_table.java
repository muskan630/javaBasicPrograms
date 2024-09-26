import java.util.Scanner;
public class while_loop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Welcome to Multiplication table !");
		System.out.print("PLease enter a number that you want to find multiplication table :");
		int num = input.nextInt();
		Multiplicationtable(num);
		}
		public static void Multiplicationtable(int num){
			int count =1 ;
			while(count<=10) {
				System.out.println(num +" *" + count +" =" +(num*count));
				count++;
		}
	}
}
