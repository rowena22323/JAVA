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
	
// 오버라이딩 ★★★★★ - 동일코드 재 정의 로 클래스별로 다양하게 사용 
// 상하위 클래스 간 동일코드로 다양한내용을 유지하면서 프로그램 구동
	public static void main(String[]args) {
		
		 Database db=CreateDatabase("mysql");
		 db.open();
		
		 Database db2=CreateDatabase("oracle");
		 db2.open();
		
	}
}
