//�簢���� ���̸� ���϶�. ����, ���κ� �Է¹ް� => �޼��带 �̿��Ͽ�(area)
import java.util.Scanner;
public class Method4{
  public static void main(String args[ ]){	
	int width;
	int height;
	Scanner scan = new Scanner(System.in);

	System.out.print("���θ� �Է��ϼ��� : ");
	width = scan.nextInt();
	System.out.print("���θ� �Է��ϼ��� : ");
	height = scan.nextInt();

	//�޼��� ȣ��
	int area = area(width, height);
	
	System.out.println("���̴� : "+area);
	
  }//end of main method
  public static int area(int width, int height){
	return width*height;
  }//end of area method
}//end of class