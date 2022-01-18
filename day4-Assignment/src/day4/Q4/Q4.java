package day4.Q4;

import java.util.*;

/*
 Write a program that will prompt user to input a number or enter -1 to quit the program. You will then
read the value using the nextInt() method of Scanner object and display if the number is even or
odd. If user enters anything other than integer number. nextInt() method will throw
InputMismatchException. You have to catch the exception and display a message saying “You
must enter an integer”. 
 */
public class Q4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
			try {
				int no = sc.nextInt();
				if (no == -1) {
					break;
				}
				if (no % 2 == 0) {
					System.out.println("You have entered an even number");
				} else {
					System.out.println("You have entered an odd number");
				}
			} catch (InputMismatchException e) {
				System.out.println("You must enter an integer");
				sc.next();

			}
		}
		sc.close();
	}

}
