package �ݺ���;
/*1���� 100���� 369������ �ǵ��� ������. 1�� �ڸ����� 3,6,9 �� �� �ڼ��Ҹ��� ������ �Ѵ�.*/
public class Games1to100_369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=100; i++) {
			if(i % 10==3 || i % 10==6 || i % 10==9) {
				System.out.println("�ڼ�");
			}else {
				System.out.println(i);
			}
		}
	}

}
