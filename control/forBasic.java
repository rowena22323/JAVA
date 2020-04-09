package javaTest;

public class forBasic {

	public static void main(String[] args) {
	
		int num=1;
		int sum=0;
		while (sum<=10) {
			num++;
			sum=num+sum;
		}
		
		int b=1; //증가값 변수 1로 초기화
		int sum1=0; //누적합을 담을 변수 sum생성
		while(b<=10) {
			sum1=sum1+b; //누적합
			System.out.println("누적합:"+sum1+" 증가값:"+b); //누적합은 값이 증가하기 전에 찍는다.
			b++; //값 증가
		}

		int sum2=0;
		for (int i=1;i<=10;i++) {
			sum2=i+sum2;
		}
		System.out.println(sum2); //총합계는 for문 밖에 한번에 꽝찍기
	}
}
