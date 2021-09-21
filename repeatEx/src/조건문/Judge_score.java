package 조건문;
/* 합격점수의 기준을 입력한 후, 학생들의 점수를 입력한다. 점수를 입력했을 때 합격여부를 알려준다.
 * 종료하고 싶을 때는 음수를 입력하면 된다.
 * */

/*1. 필요한 변수 : 기준합격점수(int)-입력받은 수를 상수로 할 수 있는가?, 학생들의 점수(배열/?),
 * 2. while(true) 학생들의 점수를 입력받는다. if(입력받은 점수 <0) break;
 * 3.   */
import java.util.Scanner;
public class Judge_score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int CUTLINE;
		int stu_score;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("합격기준점수를 입력하세요: ");
		CUTLINE = scan.nextInt();
		
		
		while(true) {
			System.out.print("학생들의 점수를 입력하세요: ");
			stu_score = scan.nextInt();
			
			if(stu_score < 0) break;
			if(stu_score >= CUTLINE) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
			
		}
	}

}
