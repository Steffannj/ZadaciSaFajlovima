/*Napisati program koji kao argument prima ime filea.
 *  U fileu – jedna linija, jedna rečenica. Ispisati sve rečenice iz 
 *  filea u obrnutom redosljedu riječi. (Npr. ukoliko je prva rečenica u
 *   fileu “Hello World“ program treba da ispiše “World Hello“)*/
package zadaciSaFajlovima;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak4 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite ime fajla: ");
		String imeFajla = unos.nextLine();
		unos.close();
		File f = new File(imeFajla);

		if (f.exists()) {
			Scanner reader = new Scanner(f);
			while (reader.hasNextLine()) {
				String linija = reader.nextLine();
				String[] rijeci = linija.split(" ");
				for (int i = rijeci.length - 1; i >= 0; i--) {
					System.out.print(rijeci[i] + " ");
				}
				System.out.println();
			}
			reader.close();
		} else {
			System.out.println("Fajl sa tim imenom ne postoji.");
		}
	}
}
