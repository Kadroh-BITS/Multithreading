package chorpolice04;

public class AscendingHackerThread extends HackerThread{

	public AscendingHackerThread(Vault vault) {
		super(vault);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		for(int guess =0; guess < Main.MAX_PASSWORD; guess++) {
			if(vault.isCorrectPassword(guess)) {
				System.out.println(this.getName() + " guessed the password " + guess);
				System.exit(0);
			}
		}
	}
	

}
