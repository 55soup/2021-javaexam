
import java.util.Scanner;
public class Triangle{
  public static void main(String args[ ]){
	
	double width;
	double height;
	Scanner scan = new Scanner(System.in);

	System.out.print("�غ� �Է�:");
	width = scan.nextDouble();
	System.out.print("���� �Է�:");
	height = scan.nextDouble();

	double area = getArea(width, height);
	System.out.println("�ﰢ���� ������"+area);
  }
  public static double getArea(double width, double height){
	return((width*height)/2);
  }
}