package Akanksha.labassignment2;
public class Student {
	private String name;
	private String id;
	private double grade;
	
	public Student(String id) {
		this("null",id,0.0);
		this.id = id;
	}
	public Student(String name, String id) {
		this(name,id,0.0);
		this.name = name;
		this.id = id;
	}
	public Student(String name, String id, double grade) {
		
		this.name = name;
		this.id = id;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public  void display()
	{
		if(!(getId().equals(null)))
		{
			System.out.print(" ID: "+getId()+" ");
		}
		if(!(getName().equals(null)))
		{
			System.out.print(" Name: "+getName()+" ");
		}
		if(!(getGrade()==0.0))
		{
			System.out.print(" Grade: "+getGrade()+" ");
		}
	}
	public  void display(int year)
	{
		this.display();
		System.out.println(" year: "+year+" ");
	}
}
