package exe2;

import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int service;
		int balance=100000;
		Service1 s1 = new Service1(10);
		Service2 s2 = new Service2(10000);
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("서비스를 선택하세요: ");
			service = scan.nextInt();
			
			switch(service) {
				case 1: s1.inToBalance(balance); break;
				case 2: s2.outToBalance(balance); break;
				case 3:
				case 4:
			}
		}
	}

}
