
import java.util.Scanner;
public class MajorSwitch{
  public static void main(String args[ ]){
	
	int major;
	Scanner scan = new Scanner(System.in);

	System.out.print("�б� �Է�:");
	major = scan.nextInt();

	switch(major){
	  case 1 :
	  case 2 : System.out.println("����Ʈ�����а��Դϴ�."); break;
	  case 3 :
	  case 4 : System.out.println("���ַ���а��Դϴ�."); break;
	  case 5 :
	  case 6 : System.out.println("�������а��Դϴ�."); break;
	  default : System.out.println("���� 1�ݿ��� 6�� �����Դϴ�.");
	}
  }
}