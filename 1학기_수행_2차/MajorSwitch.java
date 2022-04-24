
import java.util.Scanner;
public class MajorSwitch{
  public static void main(String args[ ]){
	
	int major;
	Scanner scan = new Scanner(System.in);

	System.out.print("학급 입력:");
	major = scan.nextInt();

	switch(major){
	  case 1 :
	  case 2 : System.out.println("소프트웨어학과입니다."); break;
	  case 3 :
	  case 4 : System.out.println("웹솔루션학과입니다."); break;
	  case 5 :
	  case 6 : System.out.println("디자인학과입니다."); break;
	  default : System.out.println("반은 1반에서 6반 사이입니다.");
	}
  }
}