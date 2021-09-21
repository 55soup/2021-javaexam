
public class Arrray_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 선언 연습
		//1. 정수 10개 저장 배열
		int num[]; //선언
		num = new int[10]; //메모리 할당
		System.out.println(num[5]); //초기값 0 출력.
		
		//2. 실수 5개 배열
		double num2[]; //선언
		num2 = new double[5]; //메모리 할당
		System.out.println(num2[4]); //초기값 0.0 출력
		
		//3. 실수 12개 배열
		double num3[] = new double[12]; //한줄 버전
		System.out.println(num3[12]); //num3[0]~num3[11] 
	}

}
