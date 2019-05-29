package media;

import java.io.Serializable;

public abstract class Media implements Serializable{

	public Media() {
	}

	public abstract void display();

	protected abstract String getTitle();

}
