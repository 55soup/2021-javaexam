package 조건문;
/*자신의 키와 체중, 활동지수를 입력하면 성인기준 하루권장칼로리를 알려줍니다.
 * 하루권장 칼로리 = 표준체중(kg)*활동지수
 * 표준체중 = (자신의 키-100)*0.9
 * 활동지수
 * - 앉아서 주로 생활하거나 매일 가벼운 움직임만 하여 활동량이 적은 경우, 25
 * - 규칙적인 생활로 보통의 활동량을 가진 경우, 33
 * - 육체노동 등 평소 신체 활동량이 많은 경우, 40*/

/*1. 필요한 변수 : 키(double), 활동지수(int), 표준체중(double) 하루권장 칼로리(double)
 * 2. 변수 입력받기 -
 * 3. 표준체중 계산.
 * 4. 하루 권장 칼로리 출력.*/
import java.util.Scanner;
public class Judge_health {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height;
		int activity;
		double standard_weight;
		double kcal;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("키를 입력하세요 : ");
		height = scan.nextDouble();
	
		System.out.println("1) 앉아서 주로 생활하거나 매일 가벼운 움직임만 하여 활동량이 적다. ");
		System.out.println("2) 규칙적인 생활로 보통의 활동량을 가졌다.");
		System.out.println("3) 육체노동 등 평소 신체 활동량이 많다.");
		System.out.println("자신이 평소에 활동하는 범위를 숫자로 입력하세요.");
		activity = scan.nextInt();
		
		switch(activity) {
		case 1 : activity = 25; break;
		case 2 : activity = 33; break;
		case 3 : activity = 40; break;
		default : System.out.println("숫자를 잘못입력했습니다.");
		}
		
		standard_weight = (height-100)*0.9;
		kcal = standard_weight*activity;
		
		System.out.println("당신의 하루 권장 칼로리는 : "+ kcal + "kcal 입니다.");
	}

}
