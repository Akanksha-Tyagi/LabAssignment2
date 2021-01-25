package akanksha.labassignment2;
import java.util.Scanner;
public class TestCircle {
public static void main(String[] args) {
	Circle circle1=new Circle();
	System.out.println("Default radius of circle is : "+circle1.getRadius()+" and default area of circle is: "+circle1.getArea()+" and default color of circle: "+circle1.getColor());
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the radius of the circle of which you want to calculate the area : ");
	double radius=sc.nextDouble();
	Circle circle2=new Circle(radius);
	System.out.println("Radius of circle is : "+circle2.getRadius()+" and  area of circle is: "+circle2.getArea()+" and color of circle: "+circle2.getColor());
	sc.close();
}
}
