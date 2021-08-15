package handlinguncaughtexception03;



public class Main {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				throw new RuntimeException("Intentional Exception");
				
			}
			
		});
		
		thread.setName("Misbehaving thread");
		
		/*
		 * This sets and uncaught exception handler for the thread before starting it
		 * This handler handles any exception that was not handled anywhere in the thread's stacktrace.
		 */
		thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("A critical error happened in the thread " + t.getName() + " the error is " + e.getMessage());
				
			}
		});
		thread.start();
		
		

	}

}
