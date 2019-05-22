package media;

public class FotoDigital extends Elektronisch {
	int year;

	public FotoDigital(String title, int year, String path) {
		super(title, path);
		this.year = year;
		super.display();
		// TODO Auto-generated constructor stub
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
