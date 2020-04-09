package proj_J;

public class named_Break_Continue {

	public static void main(String[] args) {
		Loop1:for(int i=2;i<=9;i++){
			for(int j=1;j<=9;j++){
				if(j==5)
//					break Loop1; // 5전에 짤리는 2단
//					break; // 개행삽입 + 5전에 짤리는 1단 ~ 9단
//					continue Loop1; //5전에 짤리는 1단 ~ 9단
//					continue; // 5만 없는 1단~9단 > if 조건절만 건너뛰고 다음반복으로
				System.out.println(i+"*"+j+"="+i*j);
			} // end of for i
			System.out.println(); // break
		} // end of Loop1 (break Loop1* continue Loop1) 개행은 삽입되지 않는다.

	}

}
