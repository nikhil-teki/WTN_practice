package com.wipro.multithreading.runnable;

public class ControlThreads implements Runnable{
	String threadName="";
	Thread t;
	ControlThreads(String threadName)
	{
		this.threadName=threadName;
		t=new Thread(this,threadName);
		System.out.println("New thread : "+threadName);
		t.start();
	}
	public void run()
	{
		try {
			for(int i=0;i<5;i++)
				System.out.println("Child Thread "+t.getName()+" "+i);
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControlThreads ct1=new ControlThreads("Thread One");
		ControlThreads ct2=new ControlThreads("Thread Two");
		ControlThreads ct3=new ControlThreads("Thread Three");
		System.out.println(ct1.t.getName()+"is alive : "+ct1.t.isAlive());
		System.out.println(ct2.t.getName()+"is alive : "+ct2.t.isAlive());
		System.out.println(ct3.t.getName()+"is alive : "+ct3.t.isAlive());
		try
		{
			System.out.println("Waiting for Child threads to finish.....");
			ct1.t.join();
			ct2.t.join();
			ct3.t.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(ct1.t.getName()+"is alive : "+ct1.t.isAlive());
		System.out.println(ct2.t.getName()+"is alive : "+ct2.t.isAlive());
		System.out.println(ct3.t.getName()+"is alive : "+ct3.t.isAlive());
	}

}
