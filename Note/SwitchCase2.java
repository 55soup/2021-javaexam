import java.util.Scanner;
public class SwitchCase2{
  public static void main(String args[]){
	int number;
	Scanner scan = new Scanner(System.in);
	System.out.print("���� �Է� : ");
	number = scan.nextInt();

	switch(number%2){
	     case 0: System.out.println("¦���Դϴ�."); break;
	     case 1: System.out.println("Ȧ���Դϴ�."); break;
	     default : System.out.println("���ڰ� �ƴմϴ�."); 

	}//end of switch
  }//end of main
}//end of class