/* 주어진 섭씨 온도를 화씨 온도로 바꾸어 주는 프로그램을 설계한 후 작성하라. 
주어진 섭씨 온도는 15도 이다.*/
public class Temp{
  public static void main(String args[ ]){
	//화씨
	//how? F => 9/5*c + 32
	//데이터 => 변수

	int c = 15;
	double f =  9/5.0*c+32; //1
	//int f = 9/5 * 5 + 32    1.6 = > 1
	/*double f =  9.0/5.0*c+32; 2 ******
	서로 다른 데이터를 계산하면 작은 데이터를 큰 데이터로 바꾸는 성질이 있다. */
 
	System.out.println("섭씨 " + c + "도는 화씨" + f + "도 입니다.");
  }
}