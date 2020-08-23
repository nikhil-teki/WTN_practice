package com.wipro.multithreading.runnable;

public class MultipleThreads implements Runnable{
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println(Thread.currentThread().getName()+i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleThreads mts=new MultipleThreads();
		Thread t1=new Thread(mts,"first thread ");
		Thread t2=new Thread(mts,"second thread ");
		t1.start();
		t2.start();
	}

}
