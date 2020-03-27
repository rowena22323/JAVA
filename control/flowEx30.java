package proj_J;

public class flowEx30 {

	public static void main(String[] args) {
		int sum=0, i=0;
		
		while(true) { //무한반복에는 조건문과 break가 함께 사용된다!
			if(sum>100)
				break; //sum>100일경우 조건문 밖으로
			++i; // 아닐경우 i+1 and i+sum 연산수행
			sum += i;
		}
		
		System.out.println("i="+i); // 최종결과. 1~14까지 더하면
		System.out.println("sum="+sum); // 105가 나오면서 break를 타고 while종료 :>

	}

}
