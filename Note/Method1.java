// 두 수를 더하다. = > 메서드(addTwo) = > 리턴 (int)
public class Method1{
  public static void main(String args[ ]){
	int a = 10;
	int b = 15;
	//메서드 호출
	int result = addTwo(a, b);
	System.out.println("합 : " + result);
  }//end of main method

  public static int addTwo(int a, int b){
	return (a+b);
  }//end of addTwo
}//end of class