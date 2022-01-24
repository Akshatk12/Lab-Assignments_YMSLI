package day6.Q2;

/*
 * Write a program that runs 5 threads, each thread randomizes a number 
between 1 and 10. The main thread waits for all the others to finish, calculates 
the sum of the numbers which were randomized and prints that sum. You will 
need to implement a Runnable class that randomizes a number and store it in a 
member field. When all the threads have done, your main program can go over 
all the objects and check the stored values in each object
 */
import java.util.Random;

class Sum implements Runnable {
	int sum;

	public Sum(int sum) {
		this.sum = sum;
	}

	@Override
	public void run() {
		Random random = new Random();
		int i = random.nextInt(10) + 1;
		synchronized (this) {
			System.out.println("Number: " + i);
			this.sum += i;
		}
	}

}

public class Q2 {
	public static void main(String[] args) {

		Sum thread = new Sum(0);
		Thread thread1 = new Thread(thread, "thread1");
		Thread thread2 = new Thread(thread, "thread2");
		Thread thread3 = new Thread(thread, "thread3");
		Thread thread4 = new Thread(thread, "thread3");
		Thread thread5 = new Thread(thread, "thread3");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
			System.out.println("Sum of Numbers :" + thread.sum);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main finished");
	}
}