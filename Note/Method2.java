//점수를 판별하다. (80점 이상 합격, 불합격) = > 메서드(judgeScore) = > void
public class Method2{
  public static void main(String args[ ]){	
	int score = 90;
	judgeScore(score);

  }//end of main method

  public static void judgeScore(int score){
	if(score >= 80){
	   System.out.println("합격");
	}else{
	   System.out.println("불합격");
	}
  }//end of method
	
}//end of class