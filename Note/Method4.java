//사각형의 넓이를 구하라. 가로, 세로변 입력받고 => 메서드를 이용하여(area)
import java.util.Scanner;
public class Method4{
  public static void main(String args[ ]){	
	int width;
	int height;
	Scanner scan = new Scanner(System.in);

	System.out.print("가로를 입력하세요 : ");
	width = scan.nextInt();
	System.out.print("세로를 입력하세요 : ");
	height = scan.nextInt();

	//메서드 호출
	int area = area(width, height);
	
	System.out.println("넓이는 : "+area);
	
  }//end of main method
  public static int area(int width, int height){
	return width*height;
  }//end of area method
}//end of class