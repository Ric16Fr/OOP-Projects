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

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub

		System.out.println("Film digital \n" + "Titel: " + getTitle() + "\n" + "Pfad: " + getPath());
	}
}
