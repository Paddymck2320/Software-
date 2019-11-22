package lab6;

public class Book {

	private String title, publisher, author;
	private Double price;
	
	public Book(String title, String publisher, String author, Double price){
		if(title == null || publisher == null || author == null || price == 0) {
			throw new IllegalArgumentException("Invalid Arguements!");
		}
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public String getPublisher() {
		return publisher;
	}
	public String getAuthor() {		
		return author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String toString() {
		return "\n" +"Title: " + title + "\n"+ "Publisher: " + publisher + "\n"+ "Author: " + author + "\n"+ "Price: " + price;
	}
	
	public static void main (String [] args) {
		Book [] shelf = new Book [3];
		
		Book TKM = new Book( "To Kill a Mockingbird", "J. B. Lippincott & Co.", "Harper Lee", 10.50);
		shelf[0] = TKM;
		
		Book TBT =  new Book( "The Book Thief", "Self Published", "Markus Zusak", 12.50);
		shelf[1] = TBT;
		
		Book MOV = new Book( "The Merchant of Venice", "Self Published", "William Shakespeare", 8.00);
		shelf[2] = MOV;		
		
		for(int i = 0 ; i < shelf.length; i++) {
			System.out.println(shelf[i]);
		}
	}
	
}
