
public class CastingEx{
  public static void main(String args[ ]){
	int a = 10;
	long b = a; //�ڵ�����ȯ JVM
	System.out.println(b);

	byte c;
	int d = 10;
/*CastingEx.java:10: error: incompatible types(�� �´� ������ Ÿ��)
: possible lossy conversion from int to byte
        c = d;
            ^*/
	c = (byte)d; //��������ȯ : ������
	System.out.println(c);

  }
}