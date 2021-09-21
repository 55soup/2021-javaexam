package 반복문;
/*입력받은 수 n부터 n1 까지의 합을 구하여라.*/
/*1. 필요한 변수 : 작은수(int), 큰 수(int), 합(int)
 * 2. 작은수, 큰 수 입력받기.
 * 3. (int i=작은수, i<=큰 수, i++)
 * 4. */
import java.util.Scanner;
public class Sum_nton {

	public static void main(String args[ ]) {
		// TODO Auto-generated method stub
		int num;
		int num1;
		int Sum_num_num1=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("작은수, 큰 수를 입력하세요.(스페이스바로 구분) : ");
		num = scan.nextInt();
		num1 = scan.nextInt();
		
		for(int i=num; i<=num1; i++) {
			Sum_num_num1 += i;
		}
		System.out.println(num+" 부터 "+num1+" 까지의 합은 :"+Sum_num_num1);
	}
}
