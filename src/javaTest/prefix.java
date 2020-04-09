package javaTest;

public class prefix {

	public static void main(String[] args) {
		int num = 7;
		System.out.println(++num);
		System.out.println(num++);
		System.out.println(num);
		
		
		int a = 1;
		System.out.println(a);
		int b = a++;
		System.out.println(b); //a+1À» ÇÏ°íÀÖ´Â Áß
		System.out.println(a); //postfix ´Ù½Ã Àç È£Ãâ ½Ã Áõ°¡°ªÀ» Ãâ·ÂÇÑ´Ù.
		
		int a1=1;
		System.out.println(a1);
		int b1=++a1;
		System.out.println(b1); //prefix b1Àº ÀÌ¹Ì ´õÇÏ±â 1ÀÌ µÈ »óÅÂ

		/* ÀüÄ¡ ÈÄÄ¡ÀÇ Á¤¼ö  - ¿Ü¿öµÑ°Í*/
		int d=25;
		System.out.println(d++);
		System.out.println(++d); //ÀÌÁÙÀÇ °á°ú´Â ÀÌ½ÊÄ¥ÀÎ°ÍÀÌ´Ù!!!!!!!!!
		// dÈ£Ãâ½ÃÁ¡ 26¿¡ ÀüÄ¡ÀÇ ´õÇÏ±â 1 Ãß°¡ÇØ¼­ ÀÌ½Ê¯U :-)
	}

}
