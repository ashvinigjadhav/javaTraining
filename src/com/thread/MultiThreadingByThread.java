package com.thread;

class MyThread extends Thread
{
	
	public void run ()
	{
		System.out.println(" Hi Thread");
	}
}

public class MultiThreadingByThread 
{
	
	public static void main(String args[])
	{
		while(true)
		{
		MyThread m =new MyThread();
		m.start();
		//m.run(); another way 
		}
	}
}
