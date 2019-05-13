package Time;

public class myTime {
	private int sec;
	private int min;
	private int hour;

	public myTime(int hour, int min, int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
//		test
	}

	public myTime() {
		this.hour = 0;
		this.min = 0;
		this.sec = 0;
	}

	public void advance(int h, int m, int s) {
		int hex;
		int minex;
		int secex;
		hex = getHour() + h;
//		System.out.println(h);
//	System.out.println(getHour());
//		System.out.println(hex);
		minex = getMin() + m;
		secex = getSec() + s;
		setMin(minex);
		setSec(secex);
		setHour(hex);
		if (getSec() > 59) {
			minex = getMin();
			minex++;
			secex = getSec();
			secex = secex - 60;
			setSec(secex);
			setMin(minex);
		}
		if (getMin() > 59) {
			hex = getHour();
			hex++;
			minex = getMin();
			minex = minex - 60;
			setMin(minex);
			setHour(hex);
		}
		if (getHour() == 24) {
			setHour(0);
		}
	}

	public void print() {
		System.out.println(getHour() + ":" + getMin() + ", " + getSec());
	}

	public void reset() {
		this.hour = 0;
		this.min = 0;
		this.sec = 0;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

}
