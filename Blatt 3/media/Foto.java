package media;

public class Foto extends Physisch {
	int year;

	public Foto(String title, int year, String owner) {
		super(title, owner);
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
	@Override
	public void display() {
		// TODO Auto-generated method stub

		System.out.println("Foto \n" + "Titel: " + getTitle() + "\n" + "Eigentümer" + getOwner());
	}
}
