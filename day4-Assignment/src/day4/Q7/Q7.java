package day4.Q7;

/*
 * Create a class and a method named throwException which will throw 2 exceptions 1)
InputException and 2) IOExcception. Now from the main method call this throwException
method; notice what the IDE suggest to fix the error. Choose the try/catch solution. How many
catch blocks have been added and why
 */
import java.util.*;

import day4.Q6.InputException;

import java.io.*;

public class Q7 {
	public static void throwException() throws IOException, InputException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int no = sc.nextInt();
		if (no > 100) {
			throw new InputException(100);
		} else {
			throw new IOException();
		}
	}

	public static void main(String[] args) {
		try {
			throwException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 2 catch blocks have been added
	}

}
