import java.util.Scanner;
public class Discount{
 public static void main(String args[ ]){
	int quantity;
	Scanner scan = new Scanner(System.in);

	System.out.print("��ǰ ������ �Է��ϼ��� : ");
	quantity  = scan.nextInt();
	
	getPrice(quantity);
	double price = getPrice(quantity);

	System.out.println("�� ���� : "+ price );

  }//end of main method
  public static double getPrice(int quantity){
	int price = 100000;
	if(quantity >= 10){
	   return(quantity * price * 0.9);
	}else{
	   return(quantity * price);
	}//else���� ���� ������ 10�̸��� �Է¹޾��� �� ������ ��. return 0; c���� ����.
	  
  }//end of method
}//end of class