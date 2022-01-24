package day5.Q4;

/*
 * Put data into a file named data.txt, Read from data.txt all the doubles (edited by a user) and display the 
biggest one
 */
import java.io.*;

public class Q4 {
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader(new File("data.txt")))) {
			double max = -1.0;
			String line = null;
			while ((line = br.readLine()) != null) {
				if (max < Double.parseDouble(line)) {
					max = Double.parseDouble(line);
				}
			}
			System.out.println("Biggest Number from data :" + max);
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getStackTrace());
		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}
	}
}
