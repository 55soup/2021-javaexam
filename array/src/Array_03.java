
public class Array_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭 a[10]�� 1~10���� ����
		//a[0]~a[9]���� ���� ���ϱ�

		int[] a = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int sum = 0;

		for(int i=0; i<a.length; i++){ //a �迭�� �ڵ����̸� ������ͼ� ���
		    sum += a[i];
		}
		System.out.println(sum);

		int[] b = new int[] {3,6,7,8,10,20,30,6,2,3};
		for (int i = 0; i<b.length; i++){ //�ε��� 0~17, ���� 18
		   sum += b[i];
		}
		System.out.println(sum);
	}

}
