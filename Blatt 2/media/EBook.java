package media;

public class EBook extends Elektronisch {
	int year;
	String author;
	String publisher;

	public EBook(String title, String author, int year, String publisher, String path) {
		super(title, path);
		this.year = year;
		this.author = author;
		this.publisher = publisher;
		display();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

		System.out.println("EBook \n" + "Titel: " + getTitle() + "\n" + "Pfad: " + getPath());
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

}
