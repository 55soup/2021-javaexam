package ex;

/* Ŀ�� �޴��� ����ϰ�, ������� �Է¿� ���� �� ��갪�� ���Ͽ� ����غ���.
 *  �Ƹ޸�ī��    2000��;
 	ī���    3500��;
 	ī��� �����ƶ�        5000��;
 	�ڹ�Ĩ ������ġ��    6500��;
 	���α׷� ���� stop == 0; */
import java.util.Scanner;
public class CafeCoffee_meau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�޴��� ���ϼ���");
		System.out.println("\t"+"***MEAU***");
		System.out.println("ī���"+"    "+"\t"+"3500��");
		System.out.println("ļ��Ḷ���ƶ�"+"\t"+"5000��");
		System.out.println("�ڹ�Ĩ������ġ��"+"\t"+"6500��");
		
		int sum=0;
		String menu;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("�޴��� �Է��ϼ���");
			menu = scan.nextLine();
//			input=scan.hasNext();
			System.out.println(menu);
			if(menu.equals("ī���")) {
				System.out.println("ī��� �� ���� �ֹ��մϴ�.");
				sum+=3500;
			}else if(menu.equals("ļ��Ḷ���ƶ�")) {
				System.out.println("ļ��� �����ƶ� �� ���� �ֹ��մϴ�.");
				sum+= 5000;
			}else if(menu.equals("�ڹ�Ĩ������ġ��")) {
				System.out.println("�ڹ�Ĩ  ������ġ�븦 �ֹ��մϴ�.");
				sum+= 6500;
			}else if(menu.equals("0"))
				break;
			else
				System.out.println("���ڸ� ����� �Է��ϼ���");
	      }
		
		System.out.println("***dill***");
		System.out.println("�� �հ� : "+sum);
		}
	}

