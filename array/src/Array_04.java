
public class Array_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 1+2+3+4+5 = ?
		int []a= new int[5]; //����(length=5), �ε���(0~4)
		int sum=0;
		for(int i=0; i<a.length; i++) {
			a[i] = i+1; //�ȿ� �� ���ڵ��� �ε������� 1ŭ.
			sum += a[i]; 
		}
		/*
		for(int i=0; i<a.length; i++) {
			sum += a[i]; ���� for���� �Ȱ���.
		}
		*/
		System.out.println("1+2+3+4+5= "+sum);
		
		//2. ��, ��, ��, �� ���� => ��, ��, ��  ��
		int[] score = new int[]{98, 75, 56, 92}; //���ڿ� ��Ģ��x for���� ������.
		for(int i=0; i<score.length-1; i++) {
			sum += score[i];
		}
		System.out.println(sum+"��");
	}

}
