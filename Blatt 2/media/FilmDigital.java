package media;

public class FilmDigital extends Elektronisch {
	int runtime;
	int year;

	public FilmDigital(String title, int runtime, int year, String path) {
		super(title, path);
		this.runtime = runtime;
		this.year = year;
		super.display();
		// TODO Auto-generated constructor stub
	}
}
