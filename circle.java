package circleprogram;

public class circle {
	private double radius;
	private String color;
	
	public circle()
	{
		radius = 1;
		color = "blue";
	}
	public circle(double r, String c) {
		radius = r;
		color = c;
	}
	public double getRadius() //Returns radius
	{
		return radius;
	}
	
	public double getArea() //Returns area
	{
		double area = (3.14 * radius * radius);
		return area;
	}
	public String getColor() //This is the only way I could figure out how to get color to print
	{
		return color;
	}
}
