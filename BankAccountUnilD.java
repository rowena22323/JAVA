package bank;

class BankAccount {
	String accNumber;
	String ssNumber;
	int balance=0;
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public void initAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	public int checkMybalance2() {
		System.out.println("°èÁÂ¹øÈ£ :"+accNumber);
		System.out.println("ÁÖ¹Î¹øÈ£ :"+ssNumber);
		System.out.println("ÀÜ¾× :"+balance+'\n');
		return balance;
	}
}
class BankAccountUnilD{
	public static void main(String[]args) {
		BankAccount yoon = new BankAccount();
		yoon.initAccount("11-11-11", "999999-9999999", 10000);
		
		BankAccount park = new BankAccount();
		park.initAccount("22-22-22","000000-0000000",10000);

		yoon.deposit(5000);
		park.deposit(3000);
		yoon.withdraw(2000);
		park.withdraw(2000);
		yoon.checkMybalance2();
		park.checkMybalance2();
		
}
}