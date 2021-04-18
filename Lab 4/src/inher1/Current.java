package inher1;

public class Current extends Account {
	double overdraftLimit;

	void currentAccount(double od) {
		this.overdraftLimit = od;
	}

	void withdraw(double amount) {
		if (amount > overdraftLimit) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
