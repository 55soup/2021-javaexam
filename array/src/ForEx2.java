
public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[100];
		int result = 0;
		
		for(int i=0; i<=99; i++) {
			num[i] = i+1;
			result += num[i];
			
		}
		System.out.println("1���� 100������ ����: "+result);
	}

}
