package day4.Q5;
/*
 * Modify the code to throw an Exception if the number is greater than 100, set the exception
message to “Number can’t be greater than 100”. Catch the Exception and display the exception
message
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
			try {
				int no = sc.nextInt();
				if (no == -1) {
					break;
				}
				if(no>100)
					throw new Exception();
				if (no % 2 == 0) {
					System.out.println("You have entered an even number");
				} else {
					System.out.println("You have entered an odd number");
				}
			} catch (InputMismatchException e) {
				System.out.println("You must enter an integer");
				sc.next();

			}
			catch(Exception e) {
				System.out.println("Number can't be greater than 100");
			}
		}
		sc.close();
	}

}


