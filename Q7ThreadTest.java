package stack;

import java.util.ArrayList;
import java.util.Vector;

public class Q7ThreadTest {
	private ArrayList<String> threadNames = new ArrayList<String>();

	public static void main(String[] args) {
	 Q7ThreadTest test = new Q7ThreadTest();
	 test.threadTest(Integer.parseInt("3"));
	 System.out.println(test.threadNames);
	}

	private void threadTest(int numOfThreads) {
	 Thread[] threads = new Thread[numOfThreads];
	 for (int i = 0; i < threads.length; i++) {
	     threads[i] = new Q7ThreadTest.MyThread();
	     //threads[i].start();
	 }
	 //for (int i = 0; i < threads.length; i++) {
	    int i = 0;
	     while(i < threads.length){
	     try {
	      if(i == 0){
	         threads[i].start();
	            threads[i].join();
	            i++;
	      } 
	      else if(!threads[i-1].isAlive()){
	       threads[i].start();
	       threads[i].join();
	       i++;
	      }
	     } catch (InterruptedException ignore) {}
	     }
	}
	class MyThread extends Thread {
	 public void run() {
	     for (int i = 0; i < 100000000; i++) {
	         i = i + 0;
	     }
	     threadNames.add(getName());
	 }
	}

}
