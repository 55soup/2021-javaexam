package 조건문;
/* 커피 메뉴를 출력하고, 사용자의 입력에 따라 총 계산값을 구하여 출력한다..
 *  1) 아메리카노    2000원
 	2) 카페라떼    3500원
 	3) 카라멜 마끼아또        5000원
 	4) 자바칩 프라프치노    6500원
 	5) 주문종료
 	
 	숫자를 입력받아 주문하며, 수량도 체크한다.
 	영수증에는 총액을 출력한다.
 	*/
/*1. 필요한 변수 입력받는수(int) 수량(int) 총가격(int)
 * 2. 어떤 메뉴, 몇 개를 주문할것인지 물어봄. 
 * 3. 5를 입력했을 때 영수증이 나오도록 함. */
import java.util.Scanner;
public class CoffeeOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int count;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("* * *메 뉴 판* * *");
		System.out.println("1)아메리카노"+"\t"+"2000 원");
		System.out.println("2)카페라떼"+"\t"+"3500 원");
		System.out.println("3)캬라멜 마끼아또"+"\t"+"5000 원");
		System.out.println("4)자바칩 프라프치노"+"\t"+"6500 원");
		System.out.println("5)주문 종료");
		
		while(true) {
			System.out.print("(숫자로 입력하세요)어떤 메뉴를 주문하시겠어요?");
			num = scan.nextInt();
			if(num == 5) break;
			
			System.out.print("몇 개 주문하시겠어요? : ");
			count = scan.nextInt();
				while(true) {
					/*switch(num){
					case 1 : total += 2000*count; break;
					case 2 : total += 3500*count; break;
					case 3 : total += 5000*count; break;
					case 4 : total += 6500*count; break;
					default : System.out.println("다른 숫자를 입력해주세요.");*/ 
					/*	break문은 가장 가까운 while, for, switch, do while을 나간다. 때문에
					 * switch문을 쓰게되면 switch문만 나가게 되고, 입력받은수가 없기 때문에 무한루프가 걸리게된다.
					 * 따라서 이문제의 경우는 if문을 쓰는것이 적절하다.*/
					
					if(num==1) {
						total += 2000*count; break;
					}else if(num==2) { 
						total += 3500*count; break;
					}else if(num==3) { 
						total += 5000*count; break;
					}else if(num==4) { 
						total += 6500*count; break;
					}else {
						System.out.println("다른 숫자를 입력해주세요.");
					}
				}
			}
		
		System.out.println("\n"+"* * *영수증* * *");
		System.out.println("총 가격 : "+ total +"원");
	}

}
