package MultiThreading_Practical;

import java.util.*;

class MyThread extends Thread {
	
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.printf("first thread=%d\t%b\n", i, isAlive());
				if (i == 3) {
					stop();
				}
				Thread.sleep(10000);
			}

		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}
}

class MyThread1 extends Thread {
	public void run() {

		try {
			for (int i = 1; i <= 50; i++) {
				System.out.printf("second thread=%d\n", i);
				if (i == 3) {
					stop();
				}
			}
			Thread.sleep(1000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class ThreadApp {

	public static void main(String[] args) throws InterruptedException {
		MyThread m = new MyThread();
		m.start();
		m.join();
		System.out.println("Status of first thread is:" + m.isAlive());
		MyThread1 m1 = new MyThread1();
		m1.start();

	}

}
