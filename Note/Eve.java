/*1부터 100사이의 숫자 중 짝수를 구해보자.*/

public class Eve{
  public static void main(String args[ ]){

	int sum = 0;

	for(int i = 1; i<=100; i++){
	    if(i%2==0){
	      sum += i;  
	      System.out.println(i);  	
	}else{}
	}
	  System.out.println("1부터 100까지 짝수의 합은 : " + sum);
  }	
}