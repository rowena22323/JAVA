package proj_J;

public class condition2_Operator {

	public static void main(String[] args) {
		
		/* 조건 연산자 ?: 
		 * (조건식) ? 식1(조건식이 참): 식2(조건식이 거짓) 
		 * if문보다 간단하다! 중첩 가능*/
		
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x=10;
		y=-5;
		z=0;
		
		absX=x >=0 ? x:-x; //x의 값이 0보다 작으면 -x로 출력
		absY=y >=0 ? y:-y;
		absZ=z >=0 ? z:-z;
		
		signX = x>0 ? '+' : (x==0 ? ' ' : '-'); // 0보다 크다면 '+'를 붙이고 출력 + (중첩) 0이면 공백, 아니면 '-'
		signY = y>0 ? '+' : (y==0 ? ' ' : '-');
		signZ = z>0 ? '+' : (z==0 ? ' ' : '-');
		
		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
	}

}
