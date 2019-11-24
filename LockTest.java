/*
* @Author: bear
* @Date:   2019-11-24 15:22:56
* @Last Modified by:   bear
* @Last Modified time: 2019-11-24 17:28:27
*/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest implements Runnable {

	int count = 0;
	public static final int threadNum = 2;
	Lock lock = new ReentrantLock();
	@Override
	public void run() {
		doCount();
	}

	public void doCount() {

		try {
			lock.lock();
			for (int i = 0; i < 20; i++) {
				count++;
				System.out.println(count);
			}
		} finally {
			lock.unlock();
		}


	}

	public static void main(String[] args) {
		LockTest lockTest = new LockTest();

//		Thread[] threads = new Thread[threadNum];
//		for (int i = 0; i < threadNum; i++) {
//			threads[i] = new Thread(lockTest);
//			threads[i].start();
//		}

		for (int i = 0; i < threadNum; i++) {
			Thread thread = new Thread(lockTest);
			System.out.println(thread.currentThread().getName());
			thread.start();
		}



//		Thread thread = new Thread(lockTest);
//		thread.start();
//		Thread thread1 = new Thread(lockTest);
//		thread1.start();
//		Thread thread2 = new Thread(lockTest);
//		thread2.start();
	}
}