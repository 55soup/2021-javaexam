
public class Array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[100]; 
		int sum = 0;
		
		for(int i=0; i<num.length; i++) { //num.length �ȵǴ� ����=> ������ ����(100)������ �ݺ�. �� ������ �̻��� �ƴ϶� �̸��� ����ؾ�.
			if((i+1) % 2 == 0) {
				num[i] = (i+1)*(-1);
			}else{
				num[i] = i+1;
			}	
			sum += num[i]; //���ϴ� �� �ϳ���
		}
			
		System.out.println("1-2+3-4+5-6... = " + sum);
		
	}

}
