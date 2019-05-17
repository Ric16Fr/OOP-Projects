package media;

public abstract class Media {
	String title;

	public Media(String title) {
	
	this.title=title;}

	public void display() {
		System.out.println(getClass());
	}
}
