package Test2;
class Animal{
	void move() {System.out.println("Animal move");}
}
class Dog extends Animal{
	void move() {System.out.println("Dog move");}
}
class Cat extends Animal{
	void move() {System.out.println("Cat move");}
}
public class Test13 {
	static void goMove(Cat c) {c.move();}
	
	public static void main(String[]args) {
		Animal a = new Animal();
		a.move();
		Dog d = new Dog();
		d.move();
		Animal a2 = new Dog();
		a2.move(); //오버라이딩 : 재정의된 메소드로 출력
		
	}
}
