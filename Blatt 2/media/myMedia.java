package media;

import java.io.*;

import javax.annotation.processing.FilerException;

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

	public void writeObject(Media m) throws FileNotFoundException, IOException {
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(m.getTitle() + ".txt"));
		o.writeObject(medium);
		o.flush();
		o.close();
	}

	public void readObject(String datei) {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(datei + ".txt"));
			medium = (Media[]) in.readObject();
			in.close();
			System.out.println(in);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}
}
