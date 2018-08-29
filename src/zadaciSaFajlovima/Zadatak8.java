/*Napisati program koji prima kao argument ime filea. 
 * Nakon što je program učitao file, vraća korisniku sve rečenice 
 * iz filea sa razmacima između riječi uklonjenim.
PRIMJER:
text.txt:
Malo viski, malo koka-kola.
konzola:
Maloviski,malokoka-kola.*/
package zadaciSaFajlovima;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak8 {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite ime fajla: ");
		String imeFajla = unos.nextLine();
		unos.close();
		File f = new File(imeFajla);

		if (f.exists()) {
			Scanner fs = new Scanner(f);

			while (fs.hasNextLine()) {
				String linija = fs.nextLine();
				String[] rijeci = linija.split(" ");
				for (String s : rijeci) {
					System.out.print(s);
				}
				System.out.println();
			}

			fs.close();
		} else {
			System.out.println("Fajl sa tim imenom ne postoji.");
		}
	}
}
