package proj_J;

public class enhanced_forLoop {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int sum=0;
		
		for (int i=0;i<arr.length;i++)
			System.out.printf("%d ", arr[i]);
		System.out.println();
		
		/* for(타입 변수명 : 배열 또는 컬렉션){
		 * 		//반복할 문장
		 * }*/
		for (int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum += tmp; // sum = sum+tmp : tmp로 읽어들인 배열 요소의 합 저장
		} // 일반적인 for문과 달리 배열이나 컬렉션에 저장된 요소들을 읽어오는 용도로만 사용할 수 있다.
		System.out.println();
		System.out.println("sum="+sum);
	}
}
