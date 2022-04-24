import java.util.Scanner;
public class Discount{
 public static void main(String args[ ]){
	int quantity;
	Scanner scan = new Scanner(System.in);

	System.out.print("제품 수량을 입력하세요 : ");
	quantity  = scan.nextInt();
	
	getPrice(quantity);
	double price = getPrice(quantity);

	System.out.println("총 가격 : "+ price );

  }//end of main method
  public static double getPrice(int quantity){
	int price = 100000;
	if(quantity >= 10){
	   return(quantity * price * 0.9);
	}else{
	   return(quantity * price);
	}//else문을 쓰지 않으면 10미만을 입력받았을 때 오류가 남. return 0; c언어에만 쓰임.
	  
  }//end of method
}//end of class