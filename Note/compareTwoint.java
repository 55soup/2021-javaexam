import java.util.Scanner;
public class compareTwoint{
 public static void main(String args[ ]){
	int number1;
	int number2;
	int result;
	Scanner scan = new Scanner(System.in);

	System.out.print("두 수 입력(스페이스로 분리) :  ");
	number1 = scan.nextInt();
	number2 = scan.nextInt();
	
	result = compareOfTwo(number1, number2);
	System.out.println(result+"가 더 큽니다.");
  }//end of main method

  public static int compareOfTwo(int number1, int number2){
	if(number1 > number2){
	  return (number1);
	}else if(number1 < number2){
	   return (number2);
	}else{
	   return 0;
	}	
  }
}