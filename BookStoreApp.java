package Akanksha.labassignment2;
import java.util.Scanner;
public class BookStoreApp {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 boolean exitStatus=false;
	 int user_input;
	 BookStore bookstore=new BookStore();
	 do {
		 int no_of_copies;
		 System.out.println();
        System.out.println("Menu Of Bookbookstore...");
        System.out.println("Enter 1- to display the Books: Title – Author – ISBN - Quantity.");
        System.out.println("2- to order new books");
        System.out.println("3- to sell books");
        System.out.println("Enter 0, to exit the system.");
        System.out.print("Enter your choice: ");
        user_input = sc.nextInt();
        switch (user_input) {
       
            case 1: bookstore.display();
            		break;
            case 2:
            		String isbn = null;
            		 no_of_copies = 0;
            		
            		System.out.print("Enter the isbn of book: ");
            		isbn = sc.next();
            		
            		System.out.print("Enter number of copies you want to order: ");
            		no_of_copies = sc.nextInt();
            		
            		bookstore.order(isbn, no_of_copies);
            	
            		break;

            		 
            case 3:
                		String booktitle = null;
                		 no_of_copies = 0;
                		
                		System.out.print("Enter the title of book: ");
                		booktitle  = sc.next();
                		
                		System.out.print("Enter number of copies you want to sell: ");
                		no_of_copies = sc.nextInt();
                		
                		bookstore.sell(booktitle, no_of_copies);
                		
                		break;

            		 
            		
            case 0: System.out.println("Thanks for coming");
                    exitStatus = true;
                    break;
            default: System.out.println("\nInvalid Choice");
        }
}
while (!exitStatus);
sc.close();
}
}
