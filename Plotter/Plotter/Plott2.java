package Plotter;
import java.awt.*;

import java.awt.event.*;

import java.io.File;

import java.util.ArrayList;



import javax.swing.*;



public class Plotter {

	public static void main(String[] args) {



		String[] dateiNamen = (new File("C:\\Users\\Richard\\Documents\\IdeaProjects\\Plotter\\Plotter").list(new FunktionsFilter()));

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


