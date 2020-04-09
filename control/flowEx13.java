package proj_J;

public class flowEx13 {

	public static void main(String[] args) {
		int sum = 0; //합계를 저장하기 위한 변수
		
		/* for (초기화;조건식;증감식) {
		 * 		//조건식이 참일때 수행될 문장
		 * 		반복횟수를 알고있을 때 사용한다.
		 * }*/
		
		for (int i=1; i<=10; i++) {
			sum +=i; // sum = sum+i;
			System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
		}

	}//main의 끝

}

class flowEx14 {
	public static void main(String[] args) {
		for (int a=1, b=10; a<=10; a++,b--) {
			System.out.printf("%d \t %d%n", a, b);
		}
	}
}
