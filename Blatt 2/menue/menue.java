package menue;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class menue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wilkommen im Men�");
		System.out.println("__________________");
		System.out.println();
		String eingabe;
		eingabe = JOptionPane.showInputDialog("Bitte w�hle 1 f�r B�ume und 2 f�r Blumen");
		int z = Integer.parseInt(eingabe);
		if (z == 1) {
			System.out.println("Wilkommen auf Seite 1");
			System.out.println("__________________");
			System.out.println();
			eingabe = JOptionPane.showInputDialog("Bitte w�hle 1 f�r eine Kastanie und 2 f�r eine Erle");
			z = Integer.parseInt(eingabe);
			if (z == 1) {
				System.out.println("Kastanie");
			} else if (z == 2) {
				System.out.println("Erle");
			} else if (z < 2 || z > 1) {
				JOptionPane.showInputDialog("Fehler, bitte beginnen Sie von vorn.");
			}
		} else if (z == 2) {
			System.out.println("Toll. Sie sind auf Seite 2.");
			System.out.println("__________________");
			System.out.println();
			eingabe = JOptionPane.showInputDialog("Bitte w�hle 1 f�r eine Rose und 2 f�r eine Dhalie");
			z = Integer.parseInt(eingabe);
			if (z == 1) {
				System.out.println("Rose");
			} else if (z == 2) {
//				Image img;
//				img = ImageIO.read("C:\Users\tinme\Pictures\dahlie.jpg");
				System.out.println("Dhalie");
			} else if (z < 2 || z > 1) {
				JOptionPane.showMessageDialog(null, "Fehler, bitte beginnen Sie von vorn.");
			}
		} else if (z < 2 || z > 1) {
			JOptionPane.showMessageDialog(null, "Fehler, bitte beginnen Sie von vorn.");
		}
	}
}
