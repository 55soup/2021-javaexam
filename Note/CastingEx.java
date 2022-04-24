
public class CastingEx{
  public static void main(String args[ ]){
	int a = 10;
	long b = a; //자동형변환 JVM
	System.out.println(b);

	byte c;
	int d = 10;
/*CastingEx.java:10: error: incompatible types(안 맞는 데이터 타입)
: possible lossy conversion from int to byte
        c = d;
            ^*/
	c = (byte)d; //강제형변환 : 개발자
	System.out.println(c);

  }
}