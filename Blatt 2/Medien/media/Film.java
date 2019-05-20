package media;

public class Film extends Physisch {
	int runtime;
	int year;

	public Film(String title, int runtime, int year, String owner) {
		super(title, owner);
		this.runtime = runtime;
		this.year = year;
		super.display();
		// TODO Auto-generated constructor stub
	}
}
