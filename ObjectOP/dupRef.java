package class2;


public class dupRef {
	public static void main(String[]args) {
		bankAccount ref1 = new bankAccount();
		bankAccount ref2 = ref1;
		
		ref1.deposit(3000);
		ref2.deposit(2000);
		ref1.withdraw(400);
		ref2.withdraw(300);
		ref1.checkMyBalance();
		ref2.checkMyBalance();
	}

}
