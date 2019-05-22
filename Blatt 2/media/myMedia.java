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

	public void suche(String text) {
		int c = 0;
		for (int i = 0; i < menge; i++) {
			if (medium[i].getTitle().contains(text)) {
				medium[i].display();
				c++;
			}
		}
		System.out.println(c);
	}

	public Media[] getMedium() {
		return medium;
	}

	public void setMedium(Media[] medium) {
		this.medium = medium;
	}

	public int getMenge() {
		return menge;
	}

	public void setMenge(int menge) {
		this.menge = menge;
	}

}
