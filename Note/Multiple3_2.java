/*1부터 100까지의 숫자 중 3의 배수인 수를 구해보자. */

public class Multiple3_2{
  public static void main(String args[ ]){

	//처리방법  number%3 == 0
	for(int i = 1; i<=100; i++){
	     if( i%3 == 0){
		System.out.println(i + "는 3의 배수");
	     }else{
		System.out.println(i + "는 3의 배수가 아니다.");
                    }
	}
	
  }
}