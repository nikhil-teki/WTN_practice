package com.wipro.multithreading.runnable;

public class ThreadDemo2 implements Runnable{
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println("Thread is running "+i);
		Thread.currentThread().setName("Demo2 thread");
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo2 td=new ThreadDemo2();
		Thread t=new Thread(td);
		t.start();
	}

}
