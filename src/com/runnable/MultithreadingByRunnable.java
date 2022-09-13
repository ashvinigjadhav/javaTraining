package com.runnable;

class MyThread implements Runnable {

	public void run() {
		System.out.println(" Hi Thread");
	}
}

public class MultithreadingByRunnable {

	public static void main(String args[]) {
		while (true) {
			MyThread m = new MyThread();
			Thread t = new Thread(m);
			t.start();
		}
	}
}
