package proj_J;

public class condition2_Operator {

	public static void main(String[] args) {
		
		/* ���� ������ ?: 
		 * (���ǽ�) ? ��1(���ǽ��� ��): ��2(���ǽ��� ����) 
		 * if������ �����ϴ�! ��ø ����*/
		
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x=10;
		y=-5;
		z=0;
		
		absX=x >=0 ? x:-x; //x�� ���� 0���� ������ -x�� ���
		absY=y >=0 ? y:-y;
		absZ=z >=0 ? z:-z;
		
		signX = x>0 ? '+' : (x==0 ? ' ' : '-'); // 0���� ũ�ٸ� '+'�� ���̰� ��� + (��ø) 0�̸� ����, �ƴϸ� '-'
		signY = y>0 ? '+' : (y==0 ? ' ' : '-');
		signZ = z>0 ? '+' : (z==0 ? ' ' : '-');
		
		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
	}

}
