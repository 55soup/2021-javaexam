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
		msg="�����Դϴ�.";
	}else{
		msg="�Ƶ��Դϴ�.";
	}*/
	msg = (age>18)? "�����Դϴ�.": "�Ƶ��Դϴ�.";
	//if else�� ������ ª�� ���� ���׿����ڸ� ����Ѵ�.
	System.out.println(msg);


  }//end of main
}//end of class