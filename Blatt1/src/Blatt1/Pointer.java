package Blatt1;

import java.text.NumberFormat;

public class Pointer {
	private int xaxe;
	private int yachse;
	private int zexs;

	public Pointer(int xaxe, int yachse, int zexs) {
		this.xaxe = xaxe;
		this.yachse = yachse;
		this.zexs = zexs;
	}

	public Pointer() {
		this.xaxe = 0;
		this.yachse = 0;
		this.zexs = 0;
	}

	public void print() {
		System.out.println("(" + getXaxe() + "," + getYachse() + "," + getZexs() + ")");

	}

	public int getXaxe() {
		return xaxe;
	}

	public void setXaxe(int xaxe) {
		this.xaxe = xaxe;
	}

	public int getYachse() {
		return yachse;
	}

	public void setYachse(int yachse) {
		this.yachse = yachse;
	}

	public int getZexs() {
		return zexs;
	}

	public void setZexs(int zexs) {
		this.zexs = zexs;
	}

	public String norm() {
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		double diff;
		double xqu;
		double yqu;
		double zqu;
		xqu =  Math.pow(getXaxe(), 2);
		yqu =  Math.pow(getYachse(), 2);
		zqu =  Math.pow(getZexs(), 2);
		diff =  java.lang.Math.sqrt(xqu+yqu+zqu);
		return nf.format(diff);
	}

	public void negate() {
		int x;
		int y;
		int z;
		x = getXaxe() * (-1);
		y = getYachse() * (-1);
		z = getZexs() * (-1);
		System.out.println("(" + x + "," + y + "," + z + ")");

	}

}
