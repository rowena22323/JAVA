package bank;

class BankAccount {
	int balance = 0;
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMybalance() {
		System.out.println("잔액:"+balance);
		return balance;
	}
}