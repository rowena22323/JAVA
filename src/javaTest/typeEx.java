package javaTest;

public class typeEx {

	public static void main(String[] args) {
		short s = Short.MAX_VALUE;
		System.out.println(s);
		
		long l = Long.MAX_VALUE;
		System.out.println(l);
		
		long ll= s; //작은타입을 큰 타입에 넣었으니 자동 형변환 된 것
		System.out.println(ll);
		
		/* 작은컵에 흘러넘치는 큰컵의 물
		short ss=l; //Type mismatch: cannot convert from long to short
		System.out.println(ss); */
		
		short s2 = (short)l; //short형으로 explicit conversion (casting)함
		//short s2 = ll; 출력안됨
		System.out.println(s2);
		
		String s3 ="1234";
		int num = Integer.parseInt(s3); 
		System.out.println(num); //type error에는 주의하자규!
		 // reference type은 나중에
		
		

	}

}
