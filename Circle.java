package Akanksha.labassignment2;

public class Circle {
	
	private double radius;
	private String color; 
	private final double PI=3.14;
	
	public Circle() {
		this.radius=1.0;
		this.color="red";
	}

	public Circle(double radius) {
		this.radius = radius;
		this.color="red";
	}
	public String getColor() {
		return color;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return (PI*radius*radius);
	}

}
