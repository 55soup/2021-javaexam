/* @�� 20�� ����ϴ� ���α׷��� �ۼ��϶�. */

public class ForTest02{
  public static void main(String args[ ]){
	int sum = 0;

	/*for(int i=1; i<=20; i++){
	    System.out.println('@'); //20��
	}*/
	
	for(int i=0; i<20; i++){
	    System.out.print("@ \t");
	}
	for (int j = 5;j <=10; j++){ //5, 6, 7, 8, 9, 10
	    System.out.print("*\t");  //6��
	}
	System.out.print("");
	for(int k=1; k < 5; k++){ //1+2+3+4
                    sum += k;
	}
	System.out.print(sum);

  }
}