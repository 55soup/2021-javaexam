package 반복문;
/*1부터 입력받은 숫자만큼 별을 출력하시오. (왼쪽 정렬)*/
/*
 * 1. 필요한 변수 : 입력받는 수(int)
 * 2. 숫자 입력 받기
 * 3. for 중첩. 
 * 4. 별 출력.*/
import java.util.Scanner;
public class Scannerstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		num = scan.nextInt();
		
		for(int i = 1; i<=num; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		

	}

}
