import java.util.Scanner;
public class compareTwoString{
 public static void main(String args[ ]){
	int number1;
	int number2;
	String result;
	Scanner scan = new Scanner(System.in);

	System.out.print("�� �� �Է�(�����̽��� �и�) :  ");
	number1 = scan.nextInt();
	number2 = scan.nextInt();
	
	result = compareOfTwo(number1, number2);
	System.out.println(result);
  }//end of main method

  public static String compareOfTwo(int number1, int number2){
	if(number1 > number2){
	  return (number1+"��(��)"+number2+"���� Ů�ϴ�.");
	}else if(number1 < number2){
	   return (number2+"��(��)"+number1+"���� Ů�ϴ�.");
	}else{
	   return ("�� ���� �����ϴ�.");
	}	
  }
}