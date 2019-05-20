package media;

public class Foto extends Physisch {
	int year;

	public Foto(String title, int year, String owner) {
		super(title, owner);
		this.year = year;
		super.display();
		// TODO Auto-generated constructor stub
	}

}
