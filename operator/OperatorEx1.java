package proj_J;

public class OperatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 단항연산자 - 증감 : 독립적으로 쓰인 경우 전위형과 후위형의 차이는 없음*/
		int a=5;
		a++;
		System.out.println(a);
		
		a=5;
		++a;
		System.out.println(a);
		
		/* 단독으로 사용되지 않은 경우 전위형과 후위형
		 * 전위형 - 변수의 값을 먼저 증가시킨 후에 변수의 값을 읽어옴 
		 * 후위형 - 변수의 값을 먼저 읽어온 후에 값 증가*/
		int i=5, j=0;
		
		j=i++;
		System.out.println("j=i++; 실행 후, i="+i+",j="+j);
		
		i=5;
		j=0;
		
		j=++i;
		System.out.println("j=++i; 실행 후, i="+i+",j="+j);
		
		/* 메서드 호출에 증감연산자가 사용된 예 */
		int ii=5, jj=5;
		System.out.println(ii++);
		System.out.println(++jj);
		System.out.println("i="+ii+",j="+jj);
		
	}

}
