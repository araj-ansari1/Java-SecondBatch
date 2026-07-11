package com.app;

class MyTask implements Runnable{
	public void run(){
		for(int i=1; i<=100; i++){
			System.out.println("I = "+i+" Thread Details :: "+Thread.currentThread().getName());
		}
	}
}
public class ThirdActivity{
	public static void main(String args[]){
		MyTask task=new MyTask();
		Thread t1=new Thread(task);
		t1.setName("India");
		t1.setPriority(Thread.MIN_PRIORITY);
		Thread t2=new Thread(task);
		t2.setName("Japan");
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();
	}
}

		