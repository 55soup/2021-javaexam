package ex;
/*��������� '1)�Ա� 2)��� 3)�ܾ���ȸ 4)����' �� �޴��� ��Ÿ����,

   ����� ��쿡�� ���� �ݾ��� �ܾ׺��� Ŭ ��� �ȳ� ������ ��������.

   �̶� �Ա�, ���, �ܾ���ȸ������ ����ڿ��� ��й�ȣ(1234)�� �䱸�ϰ� �ȴ�.*/
/*������ : 1. ����� �ݾ��� ���� ���� ����
 * 		2. ��й�ȣ ���� ����. (�ذ�)
 * 		3. ��й�ȣ�� Ʋ��Ƚ���� �ٸ� ���񽺸� �������� �� �����ǰ� �� ���ΰ� �ƴҰ��ΰ�. (�����ǰ� �Ѵ�. /�� �����Ǵ� ������ ���� ������.)*/
import java.util.Scanner;
public class Bankbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int service;
		int input;
		int output;
		int money=0;
		int password;
		int count=5;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1)�Ա�   "+"2)���   "+"3)�ܾ���ȸ   "+"4)����" );
		
		while(count > 0) {
			System.out.print("�̿��Ͻ� ���񽺸� ���ڷ� �Է����ּ��� : ");
			service = scan.nextInt();
			if(service == 4) break;
			
			while(count > 0) {
				System.out.print("��й�ȣ�� �Է��ϼ��� : ");
				password = scan.nextInt();
				if(password == 1234) {
					switch(service) {
					case 1 : System.out.print("�󸶸� �Ա��Ͻðڽ��ϱ�? : ");
							 input = scan.nextInt();
							 money += input;
							 break;
							 
					case 2 : if(money<=0) {
						 	 System.out.println("�˼��մϴ�. ����Ͻ� �� �ִ� �ݾ��� �����ϴ�.");
						 	 break;
							 }
							
								
							 System.out.print("�󸶸� ����Ͻðڽ��ϱ�? : ");
							 output = scan.nextInt();
							 if(output > money) {
								 System.out.println("����Ϸ��� �ݾ��� ���ݵǾ��ִ� �ݾ׺��� Ů�ϴ�.");
								 //break; //����ϴ� �������� �̵��� ���� ����
							 }else {
								money -= output;
							 	break;
							 }
							 
					case 3 : System.out.println("���� ������ ��� �ݾ��� : "+ money+" �� �Դϴ�."); break;
					default : System.out.println("�߸��� ���ڸ� �Է��Ͽ����ϴ�.");
					}
				break; //���񽺸� �� ��ġ�� ���ö�					
				}
				else {
					count --;
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�." + "�Է�Ƚ���� "+count+" �� ���ҽ��ϴ�.");
				}
			}
			if(count == 0) break;
		}
		
	
		
	}

}
