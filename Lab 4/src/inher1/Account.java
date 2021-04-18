package inher1;

public class Account {
	private long accnum;
	protected static double balance;
	private Person accHolder;

	Account() {
	};

	Account(long accnum, double balance, Person accHolder) {
		this.accnum = accnum;
		this.balance = balance;
		this.accHolder = accHolder;

	}

	void deposit(double amount) {
		Account.balance = balance + amount;
	}

	static double getbalance() {
		return balance;
	}

	void withdraw(double amount) {
		this.balance = balance - amount;
	}

	public long getAccnum() {
		return accnum;
	}

	public void setAccnum(long accnum) {
		this.accnum = accnum;
	}

	public double getBalance() {
		return balance;
	}

	public double setBalance(double balance) {
		return this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
}
