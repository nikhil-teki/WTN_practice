package com.wipro.multithreading.thread;

public class ThreadDemo1 extends Thread{
	public void run()
	{
		System.out.println("Thread is running");
		Thread t2=Thread.currentThread();
		System.out.println(t2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo1 td=new ThreadDemo1();
		Thread t1=Thread.currentThread();
		System.out.println(t1);
		td.start();
		Thread t2=Thread.currentThread();
		System.out.println(t2);
	}

}
