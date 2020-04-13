package Test3;

interface Cake{
	public void showCakeSize(); //interface규약 : 표준화
}
class CheeseCake implements Cake {
	@Override
	public void showCakeSize() {
		System.out.println("CheeseCake");
	}
}

public class Test15 {
	public static void main(String[]args) {
		CheeseCake c = new CheeseCake();
		c.showCakeSize();
		Cake c2 = new CheeseCake();
		c2.showCakeSize(); //cake에 암것도 없으니까 cheesecake로 넘어갔엉
	}

}
