package com.app;

class MyTask implements Runnable{
	public void run(){
		for(int i=1; i<=7; i++){
			if(i%4==0){
				System.out.println(Thread.currentThread().getName()+" is yielding.......");
				Thread.yield();
			}
			System.out.println("i = "+i+" Currently Executing Thread :: "+ Thread.currentThread().getName());
		}
	}
}
public class SecondActivity{
	 public static void main(String args[]){
		MyTask task=new MyTask();
		Thread t1=new Thread(task);
		t1.setName("India");
		Thread t2=new Thread(task);
		t2.setName("Japan");
		
		t1.start();
		t2.start();
	}
}