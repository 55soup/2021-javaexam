package ex;

/* 커피 메뉴를 출력하고, 사용자의 입력에 따라 총 계산값을 구하여 출력해보자.
 *  아메리카노    2000원;
 	카페라떼    3500원;
 	카라멜 마끼아또        5000원;
 	자바칩 프라프치노    6500원;
 	프로그램 종료 stop == 0; */
import java.util.Scanner;
public class CafeCoffee_meau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메뉴를 정하세요");
		System.out.println("\t"+"***MEAU***");
		System.out.println("카페라떼"+"    "+"\t"+"3500원");
		System.out.println("캬라멜마끼아또"+"\t"+"5000원");
		System.out.println("자바칩프라프치노"+"\t"+"6500원");
		
		int sum=0;
		String menu;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("메뉴를 입력하세요");
			menu = scan.nextLine();
//			input=scan.hasNext();
			System.out.println(menu);
			if(menu.equals("카페라떼")) {
				System.out.println("카페라떼 한 잔을 주문합니다.");
				sum+=3500;
			}else if(menu.equals("캬라멜마끼아또")) {
				System.out.println("캬라멜 마끼아또 한 잔을 주문합니다.");
				sum+= 5000;
			}else if(menu.equals("자바칩프라프치노")) {
				System.out.println("자바칩  프라프치노를 주문합니다.");
				sum+= 6500;
			}else if(menu.equals("0"))
				break;
			else
				System.out.println("글자를 제대로 입력하세요");
	      }
		
		System.out.println("***dill***");
		System.out.println("총 합계 : "+sum);
		}
	}

