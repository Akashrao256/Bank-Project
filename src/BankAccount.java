
public class BankAccount {
	
	private int accountNumber;
	private String accountHolderName;
	private int pin;
	private double balance;
	
	public BankAccount(int accountNumber, String accountHolderName, int pin, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.pin = pin;
		this.balance = balance;
	}
	
	public boolean login(int enteredPin) {
		if(enteredPin == pin) {
			System.out.println("Login Successful");
			return true;
		}
		else {
			System.out.println("Invalid PIN");
			return false;
		}
	}
	
	public void checkBalance() {
		System.out.println("Current Balance: " + balance);
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Amount Deposited Successfully");
			System.out.println("Updated Balance: " + balance);
		}
		else {
			System.out.println("Invalid Deposit Amount");
		}
	}
	
	public void withdraw(double amount) {
		if(amount <= 0) {
			System.out.println("Invalid Withdrawal Amount");
		}
		else if(amount > balance){
			System.out.println("Insufficiant Balance");
		}
		else {
			balance -= amount;
			System.out.println("Amount Withdrawn successfully");
			System.out.println("Updated Balance: " + balance);
		}
	}
	
	public void displayAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder Name: " + accountHolderName);
	}
	
}
