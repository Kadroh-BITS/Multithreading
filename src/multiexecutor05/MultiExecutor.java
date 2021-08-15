/**
 * 
 */
package multiexecutor05;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Implement a Multiexecutor. The clinet of this class will create a list of Runnable tasks and provide that list
 * into Multiexecutor constructor. 
 * When the client runs the executeAll, the MultiExecutor will execute all the given tasks
 *
 */
public class MultiExecutor {
	List<Runnable> tasks;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Runnable> tasks = new ArrayList<>();
		
		int numberOfTasks = 1000;
		for(int i=0; i<numberOfTasks; i++) {
			tasks.add(new Runnable(){
				@Override
				public void run() {
					System.out.println("Inside thread "+ Thread.currentThread().getName());					
				}
			});
			
		}
		
		MultiExecutor executor = new MultiExecutor(tasks);
		executor.executeAll();
		

	}
	
	/*
	 * @param tasks to be executed concurrently
	 */
	
	public MultiExecutor(List<Runnable> tasks) {
		this.tasks = tasks;
	}
	
	/*
	 * Starts and executes all the tasks concurrently
	 */
	
	public void executeAll() {
		List<Thread> threads = new ArrayList<>();
		
		
		for(Runnable runnable: tasks) {
			Thread thread = new Thread(runnable);
			threads.add(thread);
		}
		
		for(Thread thread: threads) {
			thread.start();
		}
		
	}

}
