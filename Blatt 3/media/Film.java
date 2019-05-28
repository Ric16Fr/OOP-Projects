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

		System.out.println("Film \n" + "Titel: " + getTitle() + "\n" + "Eigentümer: " + getOwner());
	}
}
