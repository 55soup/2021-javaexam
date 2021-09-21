

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//초기화연습
		//1. 10개 정수 배열, 1,2,3.....10(초기화)
		int num[] = new int[10]; //int num[]; num=new int[10];
		num[0] = 1; num[1] = 2; num[2] = 3; num[3] = 4; num[4] = 5;
		num[5] = 6; num[6] = 7; num[7] = 8; num[8] = 9; num[9] = 10;
		
		//2. 5개 실수 배열, 1.2, 1.3, 1.4, 1.5, 1.6
		double num2[] = new double[] {1.2, 1.3, 1.4, 1.5, 1.6};
		
		//3. 프로그램 => 10개 정수 배열, 1,2,3.....10(초기화)
		int num3[] = new int[10];
		for (int i=0; i<10; i++){//초기화
			num3[i] = i+1;
			
		}
		for (int i =0; i<10; i++) {//출력
			System.out.println(num3[i]);
		}
	}

}
