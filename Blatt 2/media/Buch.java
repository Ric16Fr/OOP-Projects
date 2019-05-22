package media;

public class Buch extends Physisch {
	int year;
	String author;
	String publisher;
	int pages;

	public Buch(String title, String author, int year, String publisher, String owner, int pages) {
		super(title, owner);
		this.year = year;
		this.author = author;
		this.publisher = publisher;
		this.pages = pages;
		// TODO Auto-generated constructor stub
	}

}
