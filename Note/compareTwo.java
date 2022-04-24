import java.util.Scanner;
public class compareTwo{
 public static void main(String args[ ]){
	int number1;
	int number2;
	Scanner scan = new Scanner(System.in);

	System.out.print("수1을 입력하세요 : ");
	number1 = scan.nextInt();
	System.out.print("수2를 입력하세요 : ");
	number2 = scan.nextInt();
	
	compareOfTwo(number1, number2);
  }//end of main method
  public static void compareOfTwo(int number1, int number2){
	if(number1 > number2){
	  System.out.println(number1 + " 이(가) 더 큰 숫자입니다.");
	}else if(number1 < number2){
	   System.out.println(number2 + " 이(가) 더 큰 숫자입니다.");
	}else{
	   System.out.println("두 수는 같습니다.");
	}	
  }
}