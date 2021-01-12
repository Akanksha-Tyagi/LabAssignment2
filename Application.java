package Akanksha.labassignment2;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
public static void main(String[] args) {
	ArrayList<Student> student=new ArrayList<>(); 
	Scanner sc=new Scanner(System.in);
	String user_choice=null;
	String student_details;
	String details[];
	int user_option;
	do
	{
		System.out.println("Options for Student Class ");
		System.out.println("1 – to create a Student object. ");
        System.out.println("2 – to display the Student info");
        System.out.print("Enter your choice:  ");
        
        user_option=sc.nextInt();
        switch (user_option) {
        
        case 1:System.out.print("Student should provide there details in id-name-grade format: "); 
        	   student_details=sc.next();
        	   details=student_details.split("-");
        	   if(details.length==1)
        	   {
        		   student.add(new Student(details[0]));
        	   }
        	   else if(details.length==2)
        	   {
        		   student.add(new Student(details[1],details[0]));
        	   }
        	   else
        	   {
        		   student.add(new Student(details[1],details[0], Double.parseDouble (details[2])));
        	   }
        
        		break;
         case 2: System.out.println("Enter the year please: "); 
 	   			 int year=sc.nextInt();
 	   			 if(year<1900 || year>2999)
 	   			 {
 	   				 System.out.println("Please enter the valid year and try again....");
 	   				 break;
 	   			 }
 	   			 for(int index=0;index<student.size();index++)
 	   				 student.get(index).display(year);
 	   			 break;
 	   			 
         default: System.out.println("\nInvalid Choice.");
    }
        System.out.println("Do you Want to continue ? (Yes/No): ");
        user_choice = sc.next();
		
	}while(user_choice.equals("YES")||user_choice.equals("yes")||user_choice.equals("Yes"));
	sc.close();
}
}
