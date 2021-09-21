package 반복문;
/*입력한 숫자(정수) 의 구구단을 구합니다.*/
/*1. 필요한 변수 : 입력받을 숫자(int) 결과(int)
 * 2. 숫자입력받기
 * 3. for(int i=1; i<=9; i++)
 * 		num*i;
 * 		곱한결과 출력.*/
import java.util.Scanner;
public class ScannerGugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 (정수): ");
		num = scan.nextInt();
		
		Gugu(num);
	}
	public static void Gugu(int num) {
		
		int result;
		
		for(int i=1; i<=9; i++) {
			result=num*i;
			System.out.println(num+"*"+i+" = "+ result);
		}
		
	}

}
