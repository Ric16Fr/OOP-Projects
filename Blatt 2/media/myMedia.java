package media;

public class myMedia {
	private Media[] medium;
	int menge;

	public myMedia() {
		this.medium = new Media[100];
		this.menge = 0;
	}

	public boolean add(Media inhalt) {
		// TODO Auto-generated method stub
		if (menge > 100) {
			return false;

		} else {
			medium[menge] = inhalt;
			menge++;
			return true;
		}
	}

	public void suche(String string) {
	
		
	}

}
