package 반복문;
/*1부터 100까지 369게임이 되도록 만들어라. 1의 자리수가 3,6,9 일 때 박수소리가 나도록 한다.*/
public class Games1to100_369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=100; i++) {
			if(i % 10==3 || i % 10==6 || i % 10==9) {
				System.out.println("박수");
			}else {
				System.out.println(i);
			}
		}
	}

}
