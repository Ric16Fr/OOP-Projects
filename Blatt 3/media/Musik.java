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

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

		System.out.println("Song \n" + "Titel: " + getTitle() + "\n" + "Pfad: " + getPath());
	}
}
