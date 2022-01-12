package day1.Q4;

/* Write a boolean method called copyOf(), which an int Array and returns a copy of the given 
array. The method's signature is as follows:
public static int[] copyOf(int[] array)
*/
import java.util.*;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of elements in array ");
		int sizeOfArray = sc.nextInt();
		int array[] = new int[sizeOfArray];
		for (int i = 0; i < sizeOfArray; i++) {
			System.out.print("Enter " + (i + 1) + " element of Array ");
			array[i] = sc.nextInt();
		}
		int answerArray[] = new int[sizeOfArray];
		answerArray = copyOf(array);
		System.out.println("Copied Array:");
		for (int e : answerArray) {
			System.out.print(e + " ");
		}

	}

	public static int[] copyOf(int[] array) {
		int[] fArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			fArray[i] = array[i];
		}
		return fArray;
	}

}
