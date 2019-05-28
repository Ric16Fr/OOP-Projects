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
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

		System.out.println("Buch \n" + "Titel: " + getTitle() + "\n" + "Eigentümer: " + getOwner());
	}
}
