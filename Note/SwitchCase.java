import java.util.Scanner;
public class SwitchCase1{
  public static void main(String args[]){
	int input;
	Scanner scan = new Scanner(System.in);
	System.out.print("���� �Է� : ");
	input = scan.nextInt();

	switch(input){
	    case 0:   System.out.println("�Է��� 0�Դϴ�.");  break; //break�»����� �� �� ������ ������ ���� �ʴ´�.
	    case 1:   System.out.println("�Է��� 1�Դϴ�."); break;
	    case 2:   System.out.println("�Է��� 2�Դϴ�."); break;
	    case 3:   System.out.println("�Է��� 3�Դϴ�."); break;
	    default:  System.out.println("�Է¿����Դϴ�.");
	}

	/*if(input == 0){
	      System.out.print("�Է��� 0�Դϴ�.");
	}else if(input == 1){
	      System.out.print("�Է��� 1�Դϴ�.");
	}else if(input == 2){
	       System.out.print("�Է��� 2�Դϴ�.");
	}else if(input == 3){	
	       System.out.print("�Է��� 3�Դϴ�.");
	}else{
	       System.out.print("�Է¿����Դϴ�.");
	}*/
  }
}