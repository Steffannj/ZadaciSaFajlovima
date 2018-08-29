/*Napisati program koji prima kao argument ime filea.
 *  Nakon što je program učitao file, nalazi najdužu riječ u 
 *  svakoj liniji teksta te ispisuje istu korisniku.*/
package zadaciSaFajlovima;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite ime fajla: ");
		String imeFajla = unos.nextLine();
		unos.close();
		File f = new File(imeFajla);

		if (f.exists()) {
			Scanner fs = new Scanner(f);
			String najduzaRijec = "";
			String linija = "";
			int brLinije = 1;

			while (fs.hasNextLine()) {
				linija = fs.nextLine();
				String[] rijeci = linija.split(" ");
				najduzaRijec = rijeci[0];
				for (int i = 0; i < rijeci.length; i++) {
					if (rijeci[i].length() > najduzaRijec.length()) {
						najduzaRijec = rijeci[i];
					}
				}
				System.out.println("Najduza rijec u " + brLinije + ". liniji je: " + najduzaRijec);
				brLinije++;
			}
			fs.close();
		} else {
			System.out.println("Fajl sa tim imenom ne postoji.");
		}

	}

}
