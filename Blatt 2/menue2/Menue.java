package menue2;

import java.io.*;
import java.util.*;

public class Menue {
	private ArrayList<String> aktPos = new ArrayList<String>();

	public void showMenu(ArrayList<MenuItem> menus) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		char wahl = 'x';
		while (wahl != 's') {

			ArrayList<MenuItem> relMen = new ArrayList<MenuItem>();
			for (int i = 0; i < menus.size(); i++) {
				MenuItem m = menus.get(i);
				if (isOnPath(m) && !isInList(m, relMen)) {
					relMen.add(m);
				}
			}
			clearScreen();
			System.out.print("Hauptmenü ");
			for (int i = 0; i < aktPos.size(); i++) {
				System.out.print("Pos -> ");
				System.out.print(aktPos.get(i) + " ");
			}
			System.out.println();
			System.out.println();
			for (int i = 0; i < relMen.size(); i++) {
				MenuItem m = (MenuItem) relMen.get(i);
				int tiefe = aktPos.size();
				if (m.getLocation().length > tiefe) {
					System.out.println("Unterpunkt: " + m.getLocation()[tiefe]);
				} else {
					System.out.println("Aktion: " + m.getName());
				}
			}
			wahl = eingabe();
			if (wahl == 'b') {
				if (aktPos.size() > 0) {
					aktPos.remove(aktPos.size() - 1);
				}
			}
			if (wahl == 's') {
				System.exit(0);
			}
			if (wahl >= 49 && wahl <= (48 + relMen.size())) {
				int zahl = wahl - 48;
				MenuItem m = (MenuItem) relMen.get(zahl - 1);
				int tiefe = aktPos.size();
				if (m.getLocation().length > tiefe) {
					aktPos.add(m.getLocation()[tiefe]);
				}
			}
		}
	}

	private boolean isInList(MenuItem m, ArrayList<MenuItem> relMen) {
		// TODO Auto-generated method stub
		int tiefe = aktPos.size();
		for (int j = 0; j < relMen.size(); j++) {
			if (m.getLocation().length > aktPos.size()
					&& ((MenuItem) (relMen.get(j))).getLocation().length > aktPos.size()
					&& m.getLocation()[tiefe].equals(((MenuItem) (relMen.get(j))).getLocation()[tiefe])) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @param m
	 * @return
	 */
	private boolean isOnPath(MenuItem m) {
		// TODO Auto-generated method stub
		if (aktPos.size() > m.getLocation().length)
			return false;
		for (int i = 0; i < aktPos.size(); i++) {
			if (!aktPos.get(i).equals(m.getLocation()[i])) {
				return false;
			}
		}
		return true;
	}

	private char eingabe() throws NumberFormatException, IOException {
		System.out.print("Bitte treffen Sie Ihre Auswahl (b = Back, s = Stop): ");
		BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
		return din.readLine().charAt(0);
	}

	private void clearScreen() throws IOException {
		for (int i = 1; i < 100; i++) {
			System.out.println();
		}
	}
}
