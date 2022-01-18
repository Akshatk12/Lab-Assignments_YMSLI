package day4.Q1;

/*
  Write a program to Read from file in byte format and Write to command prompt in both byte format and using
formatted output(System.out.print or println)
 */
import java.io.*;
import java.io.FileInputStream;

public class Q1 {

	private static void readWrite(File file) {
		byte[] fileArray = new byte[(int) file.length()];
		try (FileInputStream fileInput = new FileInputStream(file)) {

			fileInput.read(fileArray);

			for (byte i : fileArray) {
				System.out.print(i + " ");
			}
			System.out.println();

			for (byte j : fileArray) {
				System.out.print((char) j);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		File file = new File("File.txt");
		readWrite(file);
	}
}