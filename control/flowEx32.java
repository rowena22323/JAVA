package proj_J;

public class flowEx32 {

	public static void main(String[] args) {
		for (int i=0;i <=10;i++){
			if(i%3==0) 
				continue; 
			 	// 조건절 if에 해당할 경우는 아래 출력을 건너뛰고 for반복의 끝으로 간다.
				// 3의 배수 3, 6, 9는 출력되지 않고 나머지만 출력
			System.out.println(i);
		}

	}

}
