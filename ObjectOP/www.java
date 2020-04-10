package class2;

class Student2{
	public Student2() { //나도 생성자다!!!
		//클래스 이름하고 동일한데 public만 나오고 return암것도 없으면 생성자라공
		System.out.println("Default Constructor");
		name="강감찬";
		//암것도 입력 안했을때 강감찬이 나와야 되는데 나는 안되넹
	}
	private String name; 
	//이거슨 멤버변수 이며 순서상관 없음 - 함수에 사용되는 변수들은 앞에 써줘
	// 느슨하고 유연한 프로그래밍을 위해 로컬 변수들은 private으로 묶어줘
	//String name;
	
	public void setName(String nm) { //멤버 메소드
		name=nm;
	}
	public String getName() {
		return name;
	}
	public void gotoSchool() {
		System.out.println(name+"이 학교에 간다.");
	}
}
public class www {
	
	public static void main(String[]args) {
//		Student2 stu = new Student2();
//		stu.setName("이순신");
//		//로컬변수가 private으로 캡슐화되어있으니 name출력이 안된당
//		stu.gotoSchool();
//		execute(stu);
//		
//		Student2 stu2 = new Student2();
//		stu2.setName("강감찬");
//		stu2.gotoSchool();		
//		execute(stu2);
		
		Student2 stu3 = new Student2();
		Student2 t2 = execute(stu3);
		Student2 t3 = execute(new Student2());
	}

	static Student2 execute(Student2 s) {
		s.gotoSchool(); //캡슐화가 되어있더라도 레퍼런스만 계속 넘겨서 사용
		return s;
	//Student2 s = execute(new Student2()) 헐 이건뭐야 함수생성을 이한줄에 한다는거야?
		
		/* 클래스의 엄청난 중요성에 대해 깊이 생각하고 고민할것
		 * 타입만 추가하면 뒤에 올 수정에도 유연하고 효율적으로 대처할 수 있다.
		 * 객체지향 프로그래밍의 가장 큰 목표 > reproducibility / modularization
		 * JVM garbage collector*/
	}
}
