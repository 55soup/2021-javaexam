import java.util.Scanner;
public class SwitchCase1{
  public static void main(String args[]){
	int major;
	Scanner scan = new Scanner(System.in);
	System.out.print("학과 입력 : ");
	major = scan.nextInt();

	switch(major){
	     case 1: System.out.println("소프트웨어학과입니다."); break;
	     //break를 생략할지 안할지 생각.
	     case 2: System.out.println("웹솔루션학과입니다."); break;
	     case 3: System.out.println("디자인학과입니다."); break;
	     default : System.out.println("존재하지 않는 학과 입니다."); 
	}//end of switch
  }//end of main
}//end of class