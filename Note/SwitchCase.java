import java.util.Scanner;
public class SwitchCase1{
  public static void main(String args[]){
	int input;
	Scanner scan = new Scanner(System.in);
	System.out.print("종류 입력 : ");
	input = scan.nextInt();

	switch(input){
	    case 0:   System.out.println("입력이 0입니다.");  break; //break는생략을 할 수 있지만 가능한 하지 않는다.
	    case 1:   System.out.println("입력이 1입니다."); break;
	    case 2:   System.out.println("입력이 2입니다."); break;
	    case 3:   System.out.println("입력이 3입니다."); break;
	    default:  System.out.println("입력오류입니다.");
	}

	/*if(input == 0){
	      System.out.print("입력이 0입니다.");
	}else if(input == 1){
	      System.out.print("입력이 1입니다.");
	}else if(input == 2){
	       System.out.print("입력이 2입니다.");
	}else if(input == 3){	
	       System.out.print("입력이 3입니다.");
	}else{
	       System.out.print("입력오류입니다.");
	}*/
  }
}