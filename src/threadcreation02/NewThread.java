/**
 * 
 */
package threadcreation02;


public class NewThread extends Thread {
	
	@Override
	public void run() {
		
		/*
		 * notice here that unlike Interface way of generating thread, we can access name of the thread
		 * by this.getName() instead of using static method Thread.currentThread.getName();
		 */
		System.out.println("Hello from " + this.getName() );
		/*
		 * We also ahve direct access to this.getPriority() and so on
		 */
	}
	

}
