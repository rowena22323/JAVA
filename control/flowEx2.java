package proj_J;

import java.util.*; //ScannerŬ���� ���

public class flowEx2 {

	public static void main(String[] args) {
		int input;
		
		System.out.print("���ڸ� �ϳ� �Է��ϼ���>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); //ȭ���� ���� �Է¹��� ������ tmp�� ����
		input = Integer.parseInt(tmp); //�Է¹��� ���ڿ� (input=tmp)�� ���ڷ� ��ȯ
		
		if(input==0) System.out.println("�Է��Ͻ� ���ڴ� 0 �Դϴ�.");
		//if �� �� ������ �ϳ����϶��� ��ȣ����, �̾�⵵ ����! - �׷����� ���δ� ������ ������.
		
		if(input!=0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
			System.out.printf("�Է��Ͻ� ���ڴ� %d�Դϴ�.", input);
			
		/* if-else������ �� ���ϰ� �� ���� �̵� ;-)
		if (input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0 �Դϴ�."); ������ ���϶� ����� ���� (����ڿ� �ݵ�� `;`)
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
		} A�� ���̸� A'�� ������ ��ݵ� �����϶��� �����Ѱ����� �ΰ��� if�� �׻� if-else�� ��ȯ�Ǵ°��� �ƴϴ�?*/
		}
	}

}
