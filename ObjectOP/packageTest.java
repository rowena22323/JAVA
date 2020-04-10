package class2;
import com.google.*;
import com.microsoft.*;

public class packageTest {
	public static void main(String[]args) {
		com.google.Employee emp = new com.google.Employee();
		//google에 있는 Employee사용
		com.microsoft.Employee emp2 = new com.microsoft.Employee();
		//microsoft에 있는 Employee사용

//		Employee emp3 = new Employee(); 
// 정확한 패키지로 import 하십시오 - 같은내용이 들어간 두개의 패키지를 동시에 import했을 때 이름충돌이 발생합니다.
	}
}
