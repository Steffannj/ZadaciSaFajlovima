/*Napisati program koji čita rečenice iz filea i vraća svaku riječ
 *  u rečenicu sa početnim velikim slovom. Da li će program da prima 
 *  ime filea kao argument ili ne, na vama je. 
 *  (Rečenica “Hello world“ u outputu treba biti pretvorena u “Hello World“)*/
package zadaciSaFajlovima;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak9 {
	public static void main(String[] args) throws FileNotFoundException {
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
					s = s.substring(0, 1).toUpperCase() + s.substring(1);
					System.out.print(s + " ");
				}
				System.out.println();
			}

			fs.close();
		} else {
			System.out.println("Fajl sa tim imenom ne postoji.");
		}
	}
}
