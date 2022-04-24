class Circle{
	double r;
	double area;
	double circum;
	
	public double getArea() {
		area= r*r*3.14;
		return area;
	}
	public double getCircum() {
		circum = 2*r*3.14;
		return circum;
	}
}
