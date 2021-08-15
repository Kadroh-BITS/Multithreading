package chorpolice04;

public class DescendingHackerThread extends HackerThread{

	public DescendingHackerThread(Vault vault) {
		super(vault);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		for(int guess = Main.MAX_PASSWORD; guess>=0; guess--) {
			if(vault.isCorrectPassword(guess)) {
				System.out.println(this.getName() + " guessed the password " + guess);
				System.exit(0);
			}
		}
	}
	
	

}
