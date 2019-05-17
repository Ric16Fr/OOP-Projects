
/*
 * Created on 30.12.2005
 *
 * To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */

import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;

import javax.swing.*;

/**
 * @author Prof. Dr. Faustmann
 *
 *         To change the template for this generated type comment go to Window -
 *         Preferences - Java - Code Generation - Code and Comments
 */
public class Plotter {

	public static void main(String[] args) {
		// Fenster mit Funktion erstellen:
		PlotterFrame p = new PlotterFrame(new Quad());
		// Fenster anzeigen:
		p.setVisible(true);
	}
}

interface DoubleMethod {
	public double compute(double value);
}

class Quad implements DoubleMethod {
	public double compute(double wert) {
		return wert * wert;
	}
}

//class F2 implements DoubleMethod {
//}
//
//class F3 implements DoubleMethod {
//}

class PlotterFrame extends JFrame {
	PlotterFrame(DoubleMethod funktion) {
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("Funktionsplotter");
		PlotPanel p = new PlotPanel(funktion);
		Container contentPane = getContentPane();
		contentPane.add(p);
	}
}

class PlotPanel extends JPanel {
	DoubleMethod f;

	PlotPanel(DoubleMethod f) {
		this.f = f;
	}

	public void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2 = (Graphics2D) g;

				// Koordinatensystem plotten
				Line2D xAchse = new Line2D.Double(0, getHeight() / 2, getWidth(), getHeight() / 2);
				Line2D yAchse = new Line2D.Double(getWidth() / 2, 0, getWidth() / 2, getHeight());
				g2.draw(xAchse);
				g2.draw(yAchse);

				// Wertetabelle berechnen
				final int UMFANG = 200; // Wieviele zu differenziernde x-Werte
				double weite = UMFANG / (double) getWidth(); // Weite eines Pixelschrittes im Koordinatensystem
				ArrayList<Point 2D> punkteListe = new ArrayList<Point 2D>();
				for (int x = -getWidth() / 2; x <= getWidth() / 2; x++) {
					// punkteListe.add(anzeigeCoord(x, (1/weite)*f.compute(weite*x)));
					punkteListe.add(anzeigeCoord(x, 40 * f.compute((1 / 40.0) * x)));
				}

				// Funktion plotten
				for (int i = 0; i + 1 < punkteListe.size(); ++i) {
					Line2D line = new Line2D.Double((Point2D) punkteListe.get(i), (Point2D) punkteListe.get(i + 1));
					g2.draw(line);
				}
			}

	public Point2D anzeigeCoord(double x, double y) {
		return new Point2D.Double(x + this.getWidth() / 2, this.getHeight() / 2 - y);
	}
}
