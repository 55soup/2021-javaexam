
import java.util.Scanner;
public class Price{
  public static void main(String args[ ]){
	
	int price;
	Scanner scan = new Scanner(System.in);

	System.out.print("���� �Է�:");
	price = scan.nextInt();

	double result = getPrice(price);
	System.out.print("���ε� ����: "+result+"��");
  }
  public static double getPrice(int price){
	if(price >= 10000){
	  return(price*0.8);
	}else{
	  return(price*0.9);
	}
  }
}