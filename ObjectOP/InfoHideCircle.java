package capsul;

class Circle {
	private double rad = 0;
	final double PI = 3.14;
	
	public Circle(double r) {
		if(r<0) {
			rad=0;
			return;
		}
		rad = r;
	}
	public double getRad() {
		return rad;
	}
	public double getArea() {
		return (rad*rad)*PI;
	}
}
public class InfoHideCircle{
	public static void main(String [] args) {
		Circle c = new Circle(1.5);
		System.out.println("¹ÝÁö¸§: "+c.getRad());
		System.out.println("³ÐÀÌ: "+c.getArea());
	}
		
}
