package class2;

public class passingRef {
	public static void main(String[]args) {
		bankAccount ref = new bankAccount();
		ref.deposit(3000);
		ref.withdraw(300);
		check(ref);
	}
	public static void check(bankAccount acc) {
		acc.checkMyBalance();
	}
}
