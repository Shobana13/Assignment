package inher1;

public class Saving extends Account {
	
	public void withdraw(double amount) {
		final double minimumBalance = 500;
		double s = super.setBalance(5000);
		if (minimumBalance <= s) {
			balance = s - amount;
			System.out.println("Balance:" + balance);
		} else {
			System.out.println("Insufficient funds");
		}
	}

}
