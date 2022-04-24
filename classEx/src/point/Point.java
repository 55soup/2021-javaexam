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
		System.out.println("x좌표가" + movingX + "만큼 이동했습니다.");
		x += movingX;
	}
	public void movey(double movingY) {
		System.out.println("y좌표가" + movingY + "만큼 이동했습니다.");
		y+= movingY;
	}
	public void printPoint() {
		System.out.println("현재 좌표의 위치는 (" + x + "," + y + ")");
	}
	
}
