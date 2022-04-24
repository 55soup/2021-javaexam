/* 직사각형 모양의 땅 면적을 계산하여 출력하는 프로그램을 설계한 후 작성하라. 
땅의 가로 길이는 100m이고 세로 길이는 50m이다. */
public class Square{
  public static void main(String args[ ]){
     //what? => 면적
     //how? => 가로 * 세로
     //data? -> 가로, 세로 데이터
	int width = 100;
	int height = 50;
	int area = width*height;
	//int area = 100*50;

	System.out.println("면적 : " + area);
	
  }
}