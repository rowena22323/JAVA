package castello;

class Document{
	static int count = 0;
	String name; //문서명
	
	Document(){ 
		this("제목없음"+ ++count); //문서 생성 시 문서명을 지정하지 않았을 때
	}
	Document(String name){
		this.name = name;
		System.out.println("문서"+this.name+"가 생성되었습니다.");
	}
}
class DocumentTest {
	public static void main(String[]args) {
		Document d1 = new Document();
		Document d2 = new Document("자바.txt"); //Document의 변수 name을 자바.txt로 지정 했으니 자바가 찍힌다. 
		Document d3 = new Document(); //아무것도 지정하지 않았을 경우에는 초기화 변수 count와 규칙 ++count에 의해 넘버링
		Document d4 = new Document();
	}

}
