
import java.util.Scanner;
public class Triangle{
  public static void main(String args[ ]){
	
	double width;
	double height;
	Scanner scan = new Scanner(System.in);

	System.out.print("밑변 입력:");
	width = scan.nextDouble();
	System.out.print("높이 입력:");
	height = scan.nextDouble();

	double area = getArea(width, height);
	System.out.println("삼각형의 면적은"+area);
  }
  public static double getArea(double width, double height){
	return((width*height)/2);
  }
}