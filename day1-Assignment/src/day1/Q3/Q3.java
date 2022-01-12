package day1.Q3;

/*Q3. Write a program called GradesAverage, which prompts user for the number of students, reads it
from the keyboard, and saves it in an int variable called numStudents. It then prompts user for the 
grades of each of the students and saves them in an int array called grades. Your program shall 
check that the grade is between 0 and 100. A sample session is as follow:
Enter the number of students: 3
Enter the grade for student 1: 55
Enter the grade for student 2: 108
Invalid grade, try again...
Enter the grade for student 2: 56
Enter the grade for student 3: 57
The average is: 56.0
*/
import java.util.*;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numStudents = sc.nextInt();
		float average = 0;
		int grades[] = new int[numStudents];
		for (int i = 0; i < numStudents; i++) {
			System.out.print("Enter the grade for student " + (i + 1) + ": ");
			grades[i] = sc.nextInt();
			while(grades[i] < 0 || grades[i] > 100) {
				System.out.println("Invalid grade, try again...");
				System.out.print("Enter the grade for student " + (i + 1) + ": ");
				grades[i] = sc.nextInt();
			}
			average += grades[i];

		}
		average /= numStudents;
		System.out.print("The average is: " + average);

	}

}
