package day6.Q1;
import java.util.*;
public class njj implements Runnable {
	static int i;
	public void run() {
		System.out.println("running");
	}
	public static void main(String[] args) {
		
Thread t=new Thread(new njj());
try {
	t.join(0);
}catch(InterruptedException e) {
}
	System.out.println("exit");


	
	}

}
