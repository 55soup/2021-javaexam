package 조건문;

/*태어난해를 입력받아 띠를 구하는 프로그램을 작성한다.
 * 자축인묘진사오미신유술해 
 * 쥐, 소, 호랑이, 토끼, 용, 뱀 ,말, 양, 원숭이, 닭, 개, 돼지 순서 
 * 1900년~ 2021년 까지의 띠를 구별.*/
/*1900년 부터 쥐띠 시작. 그 뒤로부터 12년의 간격을 두고 옴.
 * 
 * 1. 필요한 변수 : 입력받는 연도(int)
 * 2. 연도 입력받기
 * 3. switch ~ case 쥐띠에 경우 1900 ~ 2020 break; 
 * OR 쥐띠를 기점으로 나누어서 나머지로 구분. 
 * 		ex)1900년/1900 == 0 -> 쥐띠
 * 		나머지가 1일때는 소띠, 2일때는 호랑이띠 이런식으로*/
/* +의미없는 입력 데이터 보강 +입력설명보강 +switchcase문으로 바꾸기*/

import java.util.InputMismatchException;
import java.util.Scanner;
public class Judge_zodiac3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int years=-3;
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" 연도를 입력하면 12간지를 알려드립니다. (1900년 ~ 2021년 까지 가능)");
		System.out.print("연도를 입력하세요(4자리) : ");
		
		try {//문자열을 입력한경우
			years = scan.nextInt();
		}catch(Exception letter) {
			System.out.println("입력은 숫자만 가능합니다.");
		} //예외사항
		
		if(years<1900||years>2021) {//범위를 벗어난값을 입력한경우.
			System.out.println("입력은 1900년~2021년만 가능합니다.");
		}else {
			for(int i=1900; i<=2021; i+=12) {
				switch(years%i) {
				case 0: System.out.println("쥐띠 입니다."); break;
				case 1: System.out.println("소띠 입니다."); break;
				case 2: System.out.println("호랑이띠 입니다."); break;
				case 3: System.out.println("토끼띠 입니다."); break;
				case 4: System.out.println("용띠 입니다."); break;
				case 5: System.out.println("뱀띠 입니다."); break;
				case 6: System.out.println("말띠 입니다."); break;
				case 7: System.out.println("양띠 입니다."); break;
				case 8: System.out.println("원숭이띠 입니다."); break;
				case 9: System.out.println("닭띠 입니다."); break;
				case 10: System.out.println("개띠 입니다."); break;
				case 11: System.out.println("돼지띠 입니다."); break;
				
				}
			}
				
			}
	}

}