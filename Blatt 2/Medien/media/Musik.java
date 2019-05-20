package media;

public class Musik extends Elektronisch {
	int duration;
	String singer;
	String genre;

	public Musik(String title, String singer, String genre, int duration, String path) {
		super(title, path);
		// TODO Auto-generated constructor stub
		this.duration = duration;
		this.genre = genre;
		this.singer = singer;
		super.display();
	}
}
