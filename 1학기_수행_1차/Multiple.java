/*���ڸ� �Է¹ް� 5�� ������� �ƴ��� �Ǵ�.*/

import java.util.Scanner;
public class Multiple{
  public static void main(String args[ ]){

	Scanner scan = new Scanner(System.in);
	
	System.out.print("���� �Է� : ");
	int num = scan.nextInt();

	if(num % 5 == 0){
	   System.out.println(num +"�� 5�� ����̴�.");
	}else{
	   System.out.println(num +"�� 5�� ����� �ƴϴ�.");
	}//end of if
	

	
  }
}
