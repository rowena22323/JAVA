package proj_J;

public class named_Break_Continue {

	public static void main(String[] args) {
		Loop1:for(int i=2;i<=9;i++){
			for(int j=1;j<=9;j++){
				if(j==5)
//					break Loop1; // 5���� ©���� 2��
//					break; // ������� + 5���� ©���� 1�� ~ 9��
//					continue Loop1; //5���� ©���� 1�� ~ 9��
//					continue; // 5�� ���� 1��~9�� > if �������� �ǳʶٰ� �����ݺ�����
				System.out.println(i+"*"+j+"="+i*j);
			} // end of for i
			System.out.println(); // break
		} // end of Loop1 (break Loop1* continue Loop1) ������ ���Ե��� �ʴ´�.

	}

}
