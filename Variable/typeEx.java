package javaTest;

public class typeEx {

	public static void main(String[] args) {
		short s = Short.MAX_VALUE;
		System.out.println(s);
		
		long l = Long.MAX_VALUE;
		System.out.println(l);
		
		long ll= s; //����Ÿ���� ū Ÿ�Կ� �־����� �ڵ� ����ȯ �� ��
		System.out.println(ll);
		
		/* �����ſ� �귯��ġ�� ū���� ��
		short ss=l; //Type mismatch: cannot convert from long to short
		System.out.println(ss); */
		
		short s2 = (short)l; //short������ explicit conversion (casting)��
		//short s2 = ll; ��¾ȵ�
		System.out.println(s2);
		
		String s3 ="1234";
		int num = Integer.parseInt(s3); 
		System.out.println(num); //type error���� �������ڱ�!
		 // reference type�� ���߿�
		
		

	}

}
