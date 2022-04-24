// 세금을 구하다 (200이하 세금 10% 200~400 15% 400 이상 20%) = > 메서드(getTax) = > 세금리턴(double)
public class Method3{
  public static void main(String args[ ]){	
	int salary = 500;
	double tax;
	tax = getTax(salary);
	System.out.println("세금 : "+tax);
  }//end of main method

  public static double getTax(int salary){
	if(salary <= 200){
	    return (salary*0.1);
	}else if(salary < 400){
	    return (salary*0.1);
	}else{
	    return (salary*0.2);    
	}
  }//end of method
}//end of class