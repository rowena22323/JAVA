package controlFlow;

public class switchB {

	public static void main(String[] args) {
		int num = 7;
		switch(num) { //�ش� ���� ������ ����. �Է°��� case�� ��
		case 10:
			System.out.println("��");
			break; //���� case ���� �� ����
		case 9:
			System.out.println("��");
			break;
		case 8:
			System.out.println("��");
			break;
		default:
			System.out.println("���θ� ������ ����!");
		}
		
		if (num>9) {
			System.out.println("��");
		} else if (num>8) {
			System.out.println("��");
			}else if(num>7) {
				System.out.println("��");
				}else {
					System.out.println("���θ� ������ ����!");
					}
			}

	}



