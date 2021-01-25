package akanksha.labassignment2;

public class Vehicle {
	private int noOfWheel;
	private int noOfPassenger;
	private int model;
	private String make;
	public Vehicle() {
		noOfWheel = 4;
		noOfPassenger = 4;
		model = 410;
		make = "baleno";
	}
	
	public Vehicle(int noOfWheel, int noOfPassenger, int model, String make) {
		this.noOfWheel = noOfWheel;
		this.noOfPassenger = noOfPassenger;
		this.model = model;
		this.make = make;
	}  
	
	
	public int getNoOfWheel() {
		return noOfWheel;
	}
	public void setNoOfWheel(int noOfWheel) {
		this.noOfWheel = noOfWheel;
	}
	
	
	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}
	public void setModel(int model) {
		this.model = model;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	public int getNoOfPassenger() {
		return noOfPassenger;
	}
	
	public int getModel() {
		return model;
	}
	public String getMake() {
		return make;
	}
	
	public void display()
	{
		System.out.println("Vehicle make: "+make+" Vehicle model: "+model+" No of Wheel in Vehicle: "+noOfWheel+" noOfPassenger in Vehicle: "+noOfPassenger);
	}
}

class Car extends Vehicle
{
	private int  noOfDoor;
    public Car() {
    	noOfDoor=4;
    }
	public Car(int noOfDoor) {
		this.noOfDoor = noOfDoor;
	}
	
	public int getNoOfDoor() {
		return noOfDoor;
	}

	public void setNoOfDoor(int noOfDoor) {
		this.noOfDoor = noOfDoor;
	}

	public void display()
	{
		System.out.println("Car make: "+getMake()+" Car model: "+getModel()+" No of Doors in Car: "+noOfDoor);
	}
}



class SportCar extends Car
{
	public void display()
	{   
		super.setNoOfDoor(2);
		System.out.println("SportCar make: "+getMake()+" SportCar model: "+getModel()+" No of Doors in SportCar: "+getNoOfDoor());
	}
}
class  Convertible extends Car
{
	private boolean isHeadOpen;

	
	public Convertible(boolean isHeadOpen) {
		this.isHeadOpen = isHeadOpen;
	}


	public boolean isHeadOpen() {
		return isHeadOpen;
	}


	public void setHeadOpen(boolean isHeadOpen) {
		this.isHeadOpen = isHeadOpen;
	}


	public void display()
	{
		String door="close";
		if (isHeadOpen)
			door="open";
		System.out.println("Car make: "+getMake()+" Car model: "+getModel()+" No of Doors in Car: "+getNoOfDoor()+" Door is: "+door);
	}
}
