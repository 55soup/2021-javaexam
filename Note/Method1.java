// �� ���� ���ϴ�. = > �޼���(addTwo) = > ���� (int)
public class Method1{
  public static void main(String args[ ]){
	int a = 10;
	int b = 15;
	//�޼��� ȣ��
	int result = addTwo(a, b);
	System.out.println("�� : " + result);
  }//end of main method

  public static int addTwo(int a, int b){
	return (a+b);
  }//end of addTwo
}//end of class