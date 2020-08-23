package com.wipro.multithreading.thread;

public class ThreadDemo3 extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println("Running "+Thread.currentThread().getName()+" "+i);
		try {
			Thread.sleep(100);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo3 td3=new ThreadDemo3();
		td3.start();
		ThreadDemo3 td32=new ThreadDemo3();
		td32.start();
	}

}
