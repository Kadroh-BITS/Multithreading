package threadscreation01;

public class Main {
	
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("We are now in new thread " + Thread.currentThread().getName());
				System.out.println("Current Thread priority is " + Thread.currentThread().getPriority());
				
			}
			
		});
		thread.setName("New Worker Thread");
		thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("A critical error ocurred in the thread " + t.getName() + " the error is "+ e.getMessage());
				
			}
		});
		thread.setPriority(Thread.MAX_PRIORITY);
		System.out.println("We are in thread "+ Thread.currentThread().getName() + " before starting a new thread");
		thread.start();
		System.out.println("We are in thread "  + Thread.currentThread().getName() + " after starting a new thread");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
