// ������ ���ϴ� (200���� ���� 10% 200~400 15% 400 �̻� 20%) = > �޼���(getTax) = > ���ݸ���(double)
public class Method3{
  public static void main(String args[ ]){	
	int salary = 500;
	double tax;
	tax = getTax(salary);
	System.out.println("���� : "+tax);
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