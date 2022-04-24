/*한 직장인의 연간 근로소득에 대한 소득세를 
계산하는 프로그램을 설계하고 작성하라. 근로소득에 대한 소득세는 다음과 같다.*/
/*근로소득이 2000만 원 이하이면 근로소득의 5%이다.
   근로소득이 2000만 원을 초과하고 4000만 원 이하 이면 근로소득의 15%이다.
   근로소득이 4000만 원을 초과하고 8000만 원 이하이면 근로소득의 25%이다.
   근로소득이 8000만 원을 초과하면 근로소득의 40%이다.

   연간 근로소득은 입력받아야 한다.*/

import java.util.Scanner;
public class Tax_calculate{
  public static void main(String args[]){

	int salary; //근로소득
	double tax; //세금
	Scanner scan = new Scanner(System.in);

	System.out.print("근로소득을 입력하세요 : ");
	salary = scan.nextInt();
	//int salary = Integer.parseInt(args[0]);

	if(salary <= 20000000){
	  // salary *= 0.05; 
	  tax = salary * 0.05;
	}else if(salary <= 40000000){ //salary > 200000000
	   //salary *= 0.15;
	   tax = salary * 0.15;
	}else if(salary <= 80000000){
	  //salary *= 0.25;
	  tax = salary * 0.25;
	}else{
	   //salary *= 0.4;
	   tax = salary * 0.4;
	}
	System.out.println("소득세는 "+tax+" 원 이다.");	
  }
}