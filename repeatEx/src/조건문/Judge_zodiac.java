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
import java.util.Scanner;
public class Judge_zodiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int years;//입력받는 연도
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요(1900~2021) : "); //연도 입력받기
		years = scan.nextInt();
		
		for(int i=1900; i<=2021; i+=12) {
			if(years%i==0) 
				System.out.println("쥐 띠 입니다.");
			if(years%i==1)
				System.out.println("소 띠 입니다.");
			if(years%i==2)
				System.out.println("호랑이 띠 입니다.");
			if(years%i==3)
				System.out.println("토끼 띠 입니다.");
			if(years%i==4)
				System.out.println("용 띠 입니다.");
			if(years%i==5)
				System.out.println("뱀 띠 입니다.");
			if(years%i==6)
				System.out.println("말 띠 입니다.");
			if(years%i==7)
				System.out.println("양 띠 입니다.");
			if(years%i==8)
				System.out.println("원숭이 띠 입니다.");
			if(years%i==9)
				System.out.println("닭 띠 입니다.");
			if(years%i==10)
				System.out.println("개 띠 입니다.");
			if(years%i==11)
				System.out.println("돼지 띠 입니다.");
			}
			/*쥐띠를 기준으로 나누어 구분.
			 * ex) 
			 * 쥐띠인경우
			 * 1900년 / 1900년 == 0 -> 쥐 띠
			 * 소띠인겨우
			 * 1901년 / 1900년 == 0 -> 소 띠
			 * 그 외 나머지가 2면 토끼 띠 3이면 용 띠... */
		}
	}
