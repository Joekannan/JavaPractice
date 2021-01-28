package excercise_ObjClaCons.Assignment1;

public class Book {
	String title;
	String author;
	double price;
	
	public Book (String title, String name, double price) {
		this.title = title;
		this.author = name;
		this.price = price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getTitle() {
		return title;
		
	}
	
	public String getAuthor() {
		return author;
		
	}
}
