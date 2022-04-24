
import java.util.Scanner;
public class Price{
  public static void main(String args[ ]){
	
	int price;
	Scanner scan = new Scanner(System.in);

	System.out.print("가격 입력:");
	price = scan.nextInt();

	double result = getPrice(price);
	System.out.print("할인된 가격: "+result+"원");
  }
  public static double getPrice(int price){
	if(price >= 10000){
	  return(price*0.8);
	}else{
	  return(price*0.9);
	}
  }
}