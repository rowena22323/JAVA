class BBSItem {
	static int seqNo; 			//�Ϸù�ȣ �ʵ�
	String writer; 			//�ۼ��� �ʵ�
	String writtenDate;			//�ۼ����� �ʵ�
	String title;			//�����ʵ�
	String content;			//�����ʵ�
	BBSItem(String writer, String writtenDate, 
			String title, String content){//������
		this.seqNo=seqNo;
		this.writer=writer;
		this.writtenDate=writtenDate;
		this.title=title;
		this.content=content;
		seqNo++;
		System.out.println(seqNo);
	}
}
public class Test1 {
	public static void main(String[] args) {
		BBSItem b1 = new BBSItem("","","","");
		BBSItem b2 = new BBSItem("","","","");
		BBSItem b3 = new BBSItem("","","","");
	}

}
