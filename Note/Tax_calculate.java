/*�� �������� ���� �ٷμҵ濡 ���� �ҵ漼�� 
����ϴ� ���α׷��� �����ϰ� �ۼ��϶�. �ٷμҵ濡 ���� �ҵ漼�� ������ ����.*/
/*�ٷμҵ��� 2000�� �� �����̸� �ٷμҵ��� 5%�̴�.
   �ٷμҵ��� 2000�� ���� �ʰ��ϰ� 4000�� �� ���� �̸� �ٷμҵ��� 15%�̴�.
   �ٷμҵ��� 4000�� ���� �ʰ��ϰ� 8000�� �� �����̸� �ٷμҵ��� 25%�̴�.
   �ٷμҵ��� 8000�� ���� �ʰ��ϸ� �ٷμҵ��� 40%�̴�.

   ���� �ٷμҵ��� �Է¹޾ƾ� �Ѵ�.*/

import java.util.Scanner;
public class Tax_calculate{
  public static void main(String args[]){

	int salary; //�ٷμҵ�
	double tax; //����
	Scanner scan = new Scanner(System.in);

	System.out.print("�ٷμҵ��� �Է��ϼ��� : ");
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
	System.out.println("�ҵ漼�� "+tax+" �� �̴�.");	
  }
}