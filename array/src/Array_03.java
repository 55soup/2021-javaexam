
public class Array_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 a[10]에 1~10까지 저장
		//a[0]~a[9]까지 합을 구하기

		int[] a = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int sum = 0;

		for(int i=0; i<a.length; i++){ //a 배열의 자동길이를 가지고와서 계산
		    sum += a[i];
		}
		System.out.println(sum);

		int[] b = new int[] {3,6,7,8,10,20,30,6,2,3};
		for (int i = 0; i<b.length; i++){ //인덱스 0~17, 길이 18
		   sum += b[i];
		}
		System.out.println(sum);
	}

}
