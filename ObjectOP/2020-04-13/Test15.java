package Test3;

interface Cake{
	public void showCakeSize(); //interface�Ծ� : ǥ��ȭ
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
		c2.showCakeSize(); //cake�� �ϰ͵� �����ϱ� cheesecake�� �Ѿ��
	}

}
