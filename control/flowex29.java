package proj_J;

public class flowex29 {

	public static void main(String[] args) {
		for (int i=1;i<=100;i++) { //int 1~100까지 1씩 증가하면서 출력
			System.out.printf("i=%d", i);
			
			int tmp=i; //정수 i를 tmp에 저장
			
			do {
				if (tmp%10%3==0 && tmp%10!=0) // tmp%10이 3의 배수인지 확인(0제외)
					
					/* 이 식은 tmp%10의 값이 0일때도 참이므로 식 tmp%10!=0을 &&으로 연결해서
					 * tmp%10의 값이 0인 경우를 제외한다.*/
					
					System.out.print("짝!"); //'print'이므로 출력문 옆에 (가로로) 짝! 출력
			} while((tmp/=10)!=0); //(tmp/=10) == (tmp=tmp/10)
			
			System.out.println(); // 개행
		}

	}//main

}
