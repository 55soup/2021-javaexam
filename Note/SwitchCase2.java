import java.util.Scanner;
public class SwitchCase2{
  public static void main(String args[]){
	int number;
	Scanner scan = new Scanner(System.in);
	System.out.print("숫자 입력 : ");
	number = scan.nextInt();

	switch(number%2){
	     case 0: System.out.println("짝수입니다."); break;
	     case 1: System.out.println("홀수입니다."); break;
	     default : System.out.println("숫자가 아닙니다."); 

	}//end of switch
  }//end of main
}//end of class