package �ݺ���;
/*�Ǻ���ġ ����. 10��° ���ڸ� ���Ͽ���.
 * �Ǻ���ġ �����̶�? 1 1 2 3 5 8 13 21 34 55<-10��° ��... �� ���� ù° ��°���� �� �ڿ� ������ ���� ��Ģ�̴�.*/
/*1. �ʿ��� ���� : ù��° ��=1, �ι�° ��=1 (int) 
 * 2. a) ù��°��, �ι�°���� ������ ù��°�׿� ����. b) ������꿡�� ù��°�װ� �ι�°���� ������ �ι�°�׿� ����.
 * 3. a) n1=1 n2=1 n1=1+1=2
 * 	  b) n1=2 n2=1 n2=2+1=3
 * 	  c) n1=2 n2=3 n1=2+3=5 ...*/
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=1;
		int num2=1;
		
		System.out.print(num1+"\t"+num2);
		for(int i=1; i<=4; i++) {
			num1=num1+num2;
			System.out.print("\t"+num1);
			num2=num1+num2;
			System.out.print("\t"+num2);
		}
	}
		
}

