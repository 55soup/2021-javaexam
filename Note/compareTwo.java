import java.util.Scanner;
public class compareTwo{
 public static void main(String args[ ]){
	int number1;
	int number2;
	Scanner scan = new Scanner(System.in);

	System.out.print("��1�� �Է��ϼ��� : ");
	number1 = scan.nextInt();
	System.out.print("��2�� �Է��ϼ��� : ");
	number2 = scan.nextInt();
	
	compareOfTwo(number1, number2);
  }//end of main method
  public static void compareOfTwo(int number1, int number2){
	if(number1 > number2){
	  System.out.println(number1 + " ��(��) �� ū �����Դϴ�.");
	}else if(number1 < number2){
	   System.out.println(number2 + " ��(��) �� ū �����Դϴ�.");
	}else{
	   System.out.println("�� ���� �����ϴ�.");
	}	
  }
}