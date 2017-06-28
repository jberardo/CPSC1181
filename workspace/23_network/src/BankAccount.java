
public class BankAccount {

	private double amount;
	
	public BankAccount()
	{
		this.amount = 0;
	}
	
	public void deposit(double value) {
		this.amount += value;
	}

	public void withdraw(double value) {
		this.amount -= value;
	}

	public double getBalance() {
		return this.amount;
	}
	
}
