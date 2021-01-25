package akanksha.labassignment2;
import java.util.Scanner;
public class VehicleApplication {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String user_choice=null;
	int user_option;
	Vehicle vehicle;
	do
	{
		System.out.println("Options for Creation of Vehicle Objects ");
		System.out.println("1– to create a Vehicle object.  ");
        System.out.println("2– to create a Car object.");
        System.out.println("3– to create a Convertible object. ");
        System.out.println("4– to create a SportCar object");
        System.out.print("Enter your choice:  ");
        
        user_option=sc.nextInt();
        switch (user_option) {
        
        case 1:vehicle=new Vehicle(4,4,565," Toyota");
        	   vehicle.display();
        		 break;
         case 2: 
        	   vehicle=new Car(5);
        	   vehicle.display();
 	   			 break;
         case 3:
        	 	vehicle=new Convertible(true);
  	   			vehicle.display();
                break;
                
         case 4: vehicle=new SportCar(); 
  	   			 vehicle.display();
	   			 break;
 	   			 
         default: System.out.println("\nInvalid Choice.");
    }
        System.out.println("Do you Want to continue ? (Yes/No): ");
        user_choice = sc.next();
		
	}while(user_choice.equals("YES")||user_choice.equals("yes")||user_choice.equals("Yes"));
	sc.close();
}
}
