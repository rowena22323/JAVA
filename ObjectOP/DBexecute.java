package class3;

public class DBexecute {
	
	static Database CreateDatabase(String dbname) {
		Database db = null;
		switch(dbname) {
		case "mysql":
			db=new mysql();
			break;
		case "oracle":
			db=new oracle();
			break;
		}
		return db;
	}
	
// �������̵� �ڡڡڡڡ� - �����ڵ� �� ���� �� Ŭ�������� �پ��ϰ� ��� 
// ������ Ŭ���� �� �����ڵ�� �پ��ѳ����� �����ϸ鼭 ���α׷� ����
	public static void main(String[]args) {
		
		 Database db=CreateDatabase("mysql");
		 db.open();
		
		 Database db2=CreateDatabase("oracle");
		 db2.open();
		
	}
}
