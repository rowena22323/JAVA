package Test3;

class Cake22{
	public int size;
	public Cake22(int sz) {
		size = sz;
	}
	public void showCakeSize() {
		System.out.println("Bread Ounces: "+size);
	}
}

class CheeseCake22 extends Cake22{
	public int size;
	
	public CheeseCake22(int sz1, int sz2) {
		super(sz1);
		size = sz2;
	}
	public void showCakeSize() {
		System.out.println("Bread Ounces: "+super.size);
		System.out.println("Cheese Ounces: "+size);
	}
}
public class YummyCakeSize {
	public static void main(String[]args) {
		CheeseCake22 ca1 = new CheeseCake22(5,7);
		Cake22 ca2 = ca1;
		System.out.println("Bread Ounces: "+ca2.size);
		System.out.println("Cheese Ounces: "+ca1.size);
		System.out.println();
		
		ca1.showCakeSize();
		System.out.println();
		ca2.showCakeSize();
	}
}
