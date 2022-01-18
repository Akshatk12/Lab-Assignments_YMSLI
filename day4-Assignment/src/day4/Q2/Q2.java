package day4.Q2;
/*
 Write a program to Read from command prompt using character buffer and Write to a file using character 
buffer.
 */
import java.util.*;
import java.io.*;

public class Q2 {
	private static void writeFile(File file) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file)); Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter text to be written in file");
			String text = sc.nextLine();
			writer.write(text);
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	private static String readFromCP(File file) {
		String text = null;
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			while ((text = reader.readLine()) != null) {
				System.out.println(text);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return text;
	}

	public static void main(String[] args) {
		File file = new File("File2.txt");
		writeFile(file);
		readFromCP(file);
	}
}
