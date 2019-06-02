package Plotter;
import java.awt.*;

import java.awt.event.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.io.File;

import java.util.ArrayList;



import javax.swing.*;



public class Plott2 {

	public static void main(String[] args) {



		String[] dateiNamen = (new File("C:\\Users\\Richard\\Documents\\IdeaProjects\\Plotter\\Plotter").list(new Filter()));

		ArrayList<JMenuItem> list = new ArrayList<JMenuItem>();

		JFrame f = new JFrame();

		JPanel panel = new JPanel(new BorderLayout());

		f.add(panel);

		f.setTitle("Neuer Plotter");



		JMenuBar menu = new JMenuBar();

		JMenu funk = new JMenu("Funktionen");



		for (int i = 0; i < dateiNamen.length; i++) {

			final int temp = i;

			list.add(new JMenuItem(dateiNamen[i].substring(8, 11)));

			list.get(i).addActionListener(new ActionListener() {

				@SuppressWarnings("deprecation")
				public void actionPerformed(ActionEvent e) {

					Class c;

					DoubleMethod o;

					try {

						c = Class.forName("aufgabe2." + dateiNamen[temp].substring(0, 11));

						o = (DoubleMethod) c.newInstance();

						PlotPanel p = new PlotPanel(o);

						panel.removeAll();

						panel.add(p);

						f.pack();

					} catch (ClassNotFoundException e1) {

						e1.printStackTrace();

					} catch (InstantiationException | IllegalAccessException e1) {

						e1.printStackTrace();

					}

				}

			});

		}

		for (int i = 0; i < list.size(); i++) {

			funk.add(list.get(i));

		}

		menu.add(funk);



		f.setJMenuBar(menu);

		f.setSize(600, 600);

		f.setMinimumSize(new Dimension(600,600));

		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		f.setVisible(true);

	}

}


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
		ArrayList<Point2D> punkteListe = new ArrayList<Point2D>();
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

