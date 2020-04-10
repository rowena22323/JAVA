package capsul;

public class capsultest {
	public static void main(String[]args) {
		animal a = new animal();
		a.breath(); //상위 클래스!
		
		dog d = new dog(); //animal의 하위 dog클래스
		d.breath(); //상위 animal의 breath속성을 물려받았음!
		d.bark(); //dog 고유속성 a.에서는 안나온당
		
		cat c = new cat();
		c.breath();
		c.mew();
	}
}
