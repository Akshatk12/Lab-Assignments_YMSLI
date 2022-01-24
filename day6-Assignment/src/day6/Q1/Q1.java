package day6.Q1;

/*
 * Create a multithreaded program by using Runnable interface and then create, 
initialize and start three Thread objects from your class. The threads will 
execute concurrently and display from 0 to 100 in the format [thread name : 
number]
 */
class Mythread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println("Thread " + Thread.currentThread().getName() + " : " + i);
		}
	}

}

public class Q1 {
	public static void main(String[] args) {
		Mythread mythread = new Mythread();
		Thread thread1 = new Thread(mythread, "thread1");
		Thread thread2 = new Thread(mythread, "thread2");
		Thread thread3 = new Thread(mythread, "thread3");

		thread1.start();
		thread2.start();
		thread3.start();

	}
}