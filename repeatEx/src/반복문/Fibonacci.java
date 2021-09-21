package 반복문;
/*피보나치 수열. 10번째 숫자를 구하여라.
 * 피보나치 수열이란? 1 1 2 3 5 8 13 21 34 55<-10번째 수... 과 같이 첫째 둘째항이 그 뒤에 숫자의 합인 규칙이다.*/
/*1. 필요한 변수 : 첫번째 항=1, 두번째 항=1 (int) 
 * 2. a) 첫번째항, 두번째항이 합쳐져 첫번째항에 들어간다. b) 다음계산에는 첫번째항과 두번째항이 합쳐져 두번째항에 들어간다.
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

