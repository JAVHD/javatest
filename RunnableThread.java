/*
* @Author: bear
* @Date:   2019-11-07 10:28:49
* @Last Modified by:   bear
* @Last Modified time: 2019-11-07 10:29:15
*/

public class RunnableThread {

	public int count = 0;

	public class RunnableImplements implements Runnable {
		@Override
		public void run() {
			doCount();
		}

		public void doCount() {
			for (int i = 0; i < 20; i++) {
				count++;
				System.out.println(count);
			}
		}
	}

	public static void main(String[] args) {

		//多线程执行
		//Runnable runnable1 = new RunnableThread();
		//Runnable runnable2 = new RunnableThread();

//		Thread thread1 = new Thread(runnable1);
//		Thread thread2 = new Thread(runnable1);
//
//		thread1.start();
//		thread2.start();

		RunnableImplements runnableImplements = new RunnableThread.new RunnableImplements();

		for (int i = 0; i < 2; i++) {
			Thread thread = new Thread(runnableImplements);
			thread.start();
		}


	}
}
