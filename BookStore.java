package akanksha.labassignment2;
import java.util.ArrayList; 
public class BookStore {
	 Book[] books = { new Book("Thinking in java","Joshua","0198526636",100),new Book("Head first","Kathy","0198876636",10),new Book("Rich dad poor dad","Robert Kiyosaki","0178526636",230),new Book("Distilled uml","Josh","0198526636",30),
			 new Book("Let us c","Yashvant Kanetkar","0238526636",58),new Book("Secret","Rhonda Byrne","0198526136",142),new Book("One Arranged Murder","Chetan Bhagat","0198531136",150),new Book("Think Grow and Rich","Napoleon Hill","0858526636",25),
			 new Book("Getting Started with Spring Framework","Ashish sarin","0198526698",27),new Book("Spring MVC: Beginner’s Guide","Amuthan G","0142526636",79) };     
	 
	 ArrayList<Book> booklist=new ArrayList<>(); 
	 
	
	 BookStore()
	 {
		 for (int index = 0; index < books.length; index++) 
	     { 
	         booklist.add(books[index]); 
	     }
	  
	 }

	public void sell(String bookTitle, int noOfCopies)
	{
		boolean flag=false;
		for(int index=0;index<booklist.size();index++)
		{
			if((booklist.get(index).getBookTitle()).equals(bookTitle))
			{
				if(noOfCopies>booklist.get(index).getNumOfCopies())
				{
					System.out.println("Sorry we don't have this much quantity of this particular book");
					flag=true;
				}
				else {
				booklist.get(index).setNumOfCopies((booklist.get(index).getNumOfCopies())-noOfCopies);
				System.out.println("Book sell successfully.");
				flag=true;}
			}
		}
		if(!flag)
		{
			System.out.println("Sorry the book is not in the store please try again after sometime.");
		}
	}
	public void order(String isbn, int noOfCopies)
	{
		boolean flag=false;
		for(int index=0;index<booklist.size();index++)
		{
			if((booklist.get(index).getISBN()).equals(isbn))
			{
				booklist.get(index).setNumOfCopies((booklist.get(index).getNumOfCopies())+noOfCopies);
				flag=true;
			}
		}
		if(!flag)
		{
			booklist.add(new Book("defaultBook","defaultAuthor",isbn,noOfCopies)); 
			System.out.println("Book ordered successfully.");
		}

	}
	public void display()
	{ 
		booklist.forEach((book) -> book.display()); 
	}


}
