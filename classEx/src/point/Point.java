package point;

public class Point {
	double x;
	double y;
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void movex(double movingX) {
		System.out.println("x��ǥ��" + movingX + "��ŭ �̵��߽��ϴ�.");
		x += movingX;
	}
	public void movey(double movingY) {
		System.out.println("y��ǥ��" + movingY + "��ŭ �̵��߽��ϴ�.");
		y+= movingY;
	}
	public void printPoint() {
		System.out.println("���� ��ǥ�� ��ġ�� (" + x + "," + y + ")");
	}
	
}
