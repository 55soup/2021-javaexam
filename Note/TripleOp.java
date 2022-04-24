public class TripleOp{
  public static void main(String args[ ]){

	int a = 5;
	int b = 3;
	int c;
	int age = 15;
	String msg;
	/*if( a>b){
		c = a;
	}else{
		c = b;
	}*/
	c = (a>b)? a : b;
	System.out.println(c);

	/*if(age>18){
		msg="성인입니다.";
	}else{
		msg="아동입니다.";
	}*/
	msg = (age>18)? "성인입니다.": "아동입니다.";
	//if else의 문장이 짧을 때만 삼항연산자를 사용한다.
	System.out.println(msg);


  }//end of main
}//end of class