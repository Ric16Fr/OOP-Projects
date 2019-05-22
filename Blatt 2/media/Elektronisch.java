package media;

public class Elektronisch extends Media {
	String path;
	String title;

	public Elektronisch(String title, String path) {
		this.title = title;
		this.path = path;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}