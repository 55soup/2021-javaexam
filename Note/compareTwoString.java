import java.util.Scanner;
public class compareTwoString{
 public static void main(String args[ ]){
	int number1;
	int number2;
	String result;
	Scanner scan = new Scanner(System.in);

	System.out.print("두 수 입력(스페이스로 분리) :  ");
	number1 = scan.nextInt();
	number2 = scan.nextInt();
	
	result = compareOfTwo(number1, number2);
	System.out.println(result);
  }//end of main method

  public static String compareOfTwo(int number1, int number2){
	if(number1 > number2){
	  return (number1+"이(가)"+number2+"보다 큽니다.");
	}else if(number1 < number2){
	   return (number2+"이(가)"+number1+"보다 큽니다.");
	}else{
	   return ("두 수는 같습니다.");
	}	
  }
}