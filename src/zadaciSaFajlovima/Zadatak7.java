/*Napisati program koji prima kao argument ime fiela. 
 * Nakon što je program učitao file, nalazi predzadnju 
 * riječ na svakoj liniji teksta te ispisuje istu korisniku.*/
package zadaciSaFajlovima;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak7 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite ime fajla: ");
		String imeFajla = unos.nextLine();
		unos.close();
		File f = new File(imeFajla);

		if (f.exists()) {
			Scanner fs = new Scanner(f);
			int brojLinije = 1;
			while (fs.hasNextLine()) {
				String linija = fs.nextLine();
				String[] rijeci = linija.split(" ");
				if (rijeci.length > 1) {
					System.out
							.println("Predzadnja rijec u " + brojLinije + ". liniji je \"" + (rijeci[rijeci.length - 2])+"\"");
				}
				brojLinije++;
			}
			fs.close();
		} else {
			System.out.println("Fajl sa tim imenom ne postoji.");
		}
	}
}
