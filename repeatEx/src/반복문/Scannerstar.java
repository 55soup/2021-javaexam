package �ݺ���;
/*1���� �Է¹��� ���ڸ�ŭ ���� ����Ͻÿ�. (���� ����)*/
/*
 * 1. �ʿ��� ���� : �Է¹޴� ��(int)
 * 2. ���� �Է� �ޱ�
 * 3. for ��ø. 
 * 4. �� ���.*/
import java.util.Scanner;
public class Scannerstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		num = scan.nextInt();
		
		for(int i = 1; i<=num; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		

	}

}
