import java.util.Scanner;
public class SwitchCase1{
  public static void main(String args[]){
	int major;
	Scanner scan = new Scanner(System.in);
	System.out.print("�а� �Է� : ");
	major = scan.nextInt();

	switch(major){
	     case 1: System.out.println("����Ʈ�����а��Դϴ�."); break;
	     //break�� �������� ������ ����.
	     case 2: System.out.println("���ַ���а��Դϴ�."); break;
	     case 3: System.out.println("�������а��Դϴ�."); break;
	     default : System.out.println("�������� �ʴ� �а� �Դϴ�."); 
	}//end of switch
  }//end of main
}//end of class