package day4.Q6;
/*
 * Now create your own exception named “InputException” which will take an integer (let’s say n) as
parameter and set the exception message to “Number can’t be greater than [n]”. Modify the
program in #1 to throw InputException when the number is greater than 100. So, the exception
message will be “Number can’t be greater than 100”. Catch the exception and display the
exception message.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter maximum limit for numbers");
		int maxLimit=sc.nextInt();
		while (true) {
			System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
			try {
				int no = sc.nextInt();
				if (no == -1) {
					break;
				}
				if(no>maxLimit)
					throw new InputException(maxLimit);
				if (no % 2 == 0) {
					System.out.println("You have entered an even number");
				} else {
					System.out.println("You have entered an odd number");
				}
			} catch (InputMismatchException e) {
				System.out.println("You must enter an integer");
				sc.next();

			}
			catch (InputException ex) {
				System.out.println(ex.getMessage());
			}
		}
		sc.close();
	}
	
}
