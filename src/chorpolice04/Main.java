/**
 * 
 */
package chorpolice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 * Problem statement: 
 * The thief threads have to guess the pass-code of a vault by brute force concurrently before the police thread arrives. 
 * Police thread arrives 10 seconds after the threads started guessing the passcode. Police thread displays the countdown of time
 * left before he appears.
 * If the thief threads are unable to guess the code before police arrives, they get caught. n
 * 
 * ***************Class structure*************
 * 
 * abstract HackerThread extends Thread. HackerThread contains reference to Vault object.
 * AscendingHackerThread extends HackerThread
 * DescendingHackerThread extends HackerThread
 * 
 * PoliceThread extends Thread
 */
public class Main {
	
	public static final int MAX_PASSWORD = 9999;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random random = new Random();
	Vault vault = new Vault(random.nextInt(MAX_PASSWORD));
	List<Thread> threads = new ArrayList<>();
	threads.add(new AscendingHackerThread(vault));
	threads.add(new DescendingHackerThread(vault));
	threads.add(new PoliceThread());
	
	for(Thread thread: threads) {
		thread.start();
	}
	
	}

}
