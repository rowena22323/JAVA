package castello;

class Document{
	static int count = 0;
	String name; //������
	
	Document(){ 
		this("�������"+ ++count); //���� ���� �� �������� �������� �ʾ��� ��
	}
	Document(String name){
		this.name = name;
		System.out.println("����"+this.name+"�� �����Ǿ����ϴ�.");
	}
}
class DocumentTest {
	public static void main(String[]args) {
		Document d1 = new Document();
		Document d2 = new Document("�ڹ�.txt"); //Document�� ���� name�� �ڹ�.txt�� ���� ������ �ڹٰ� ������. 
		Document d3 = new Document(); //�ƹ��͵� �������� �ʾ��� ��쿡�� �ʱ�ȭ ���� count�� ��Ģ ++count�� ���� �ѹ���
		Document d4 = new Document();
	}

}
