package ���ǹ�;
/* Ŀ�� �޴��� ����ϰ�, ������� �Է¿� ���� �� ��갪�� ���Ͽ� ����Ѵ�..
 *  1) �Ƹ޸�ī��    2000��
 	2) ī���    3500��
 	3) ī��� �����ƶ�        5000��
 	4) �ڹ�Ĩ ������ġ��    6500��
 	5) �ֹ�����
 	
 	���ڸ� �Է¹޾� �ֹ��ϸ�, ������ üũ�Ѵ�.
 	���������� �Ѿ��� ����Ѵ�.
 	*/
/*1. �ʿ��� ���� �Է¹޴¼�(int) ����(int) �Ѱ���(int)
 * 2. � �޴�, �� ���� �ֹ��Ұ����� ���. 
 * 3. 5�� �Է����� �� �������� �������� ��. */
import java.util.Scanner;
public class CoffeeOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int count;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("* * *�� �� ��* * *");
		System.out.println("1)�Ƹ޸�ī��"+"\t"+"2000 ��");
		System.out.println("2)ī���"+"\t"+"3500 ��");
		System.out.println("3)ļ��� �����ƶ�"+"\t"+"5000 ��");
		System.out.println("4)�ڹ�Ĩ ������ġ��"+"\t"+"6500 ��");
		System.out.println("5)�ֹ� ����");
		
		while(true) {
			System.out.print("(���ڷ� �Է��ϼ���)� �޴��� �ֹ��Ͻðھ��?");
			num = scan.nextInt();
			if(num == 5) break;
			
			System.out.print("�� �� �ֹ��Ͻðھ��? : ");
			count = scan.nextInt();
				while(true) {
					/*switch(num){
					case 1 : total += 2000*count; break;
					case 2 : total += 3500*count; break;
					case 3 : total += 5000*count; break;
					case 4 : total += 6500*count; break;
					default : System.out.println("�ٸ� ���ڸ� �Է����ּ���.");*/ 
					/*	break���� ���� ����� while, for, switch, do while�� ������. ������
					 * switch���� ���ԵǸ� switch���� ������ �ǰ�, �Է¹������� ���� ������ ���ѷ����� �ɸ��Եȴ�.
					 * ���� �̹����� ���� if���� ���°��� �����ϴ�.*/
					
					if(num==1) {
						total += 2000*count; break;
					}else if(num==2) { 
						total += 3500*count; break;
					}else if(num==3) { 
						total += 5000*count; break;
					}else if(num==4) { 
						total += 6500*count; break;
					}else {
						System.out.println("�ٸ� ���ڸ� �Է����ּ���.");
					}
				}
			}
		
		System.out.println("\n"+"* * *������* * *");
		System.out.println("�� ���� : "+ total +"��");
	}

}
