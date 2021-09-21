
public class Array_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 1+2+3+4+5 = ?
		int []a= new int[5]; //길이(length=5), 인덱스(0~4)
		int sum=0;
		for(int i=0; i<a.length; i++) {
			a[i] = i+1; //안에 들어갈 숫자들이 인덱스보다 1큼.
			sum += a[i]; 
		}
		/*
		for(int i=0; i<a.length; i++) {
			sum += a[i]; 위에 for문과 똑같음.
		}
		*/
		System.out.println("1+2+3+4+5= "+sum);
		
		//2. 국, 영, 수, 자 점수 => 국, 영, 수  합
		int[] score = new int[]{98, 75, 56, 92}; //숫자에 규칙성x for문을 사용못함.
		for(int i=0; i<score.length-1; i++) {
			sum += score[i];
		}
		System.out.println(sum+"점");
	}

}
