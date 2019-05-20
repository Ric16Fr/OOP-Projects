package media;

public class Physisch extends Media {
	String owner;
	String title;

	public Physisch(String title, String owner) {
		this.title = title;
		this.owner = owner;
		// TODO Auto-generated constructor stub
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
