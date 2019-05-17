package media;

public class Fotos extends Elektronisch {
	int year;

	public Fotos(String title, int year, String path) {
		super(title, path);
		this.year = year;
		super.display();
		// TODO Auto-generated constructor stub
	}

}
