package castello;

class Product{
	static int count = 0;//생성된 인스턴스의 수를 저장하기 위한 변수
	int serialNo; //인스턴스 고유의 번호
	{ //인스턴스 초기화 블럭 : 모든 생성자에서 공통적으로 수행될 코드 (어떤 생성자를 사용하더라도 공통으로 사용하라고)
		++count;
		serialNo=count;
	}
	public Product() {} //생성자 :
}

public class ProductTest {
	public static void main(String args[]) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		System.out.println(p1.serialNo);
		System.out.println(p2.serialNo);
		System.out.println(p3.serialNo);
		System.out.println(Product.count);
	}

}
