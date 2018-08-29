/*Napisati program koji učitava neodređen broj brojeva iz filea
 *  te ispisuje samo neparne brojeve. File možete nasumičpno generisati.
 *   Program može da prima ime filea kao argument a i ne mora. Na vama je.*/
package zadaciSaFajlovima;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak10 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite ime fajla: ");
		String imeFajla = unos.nextLine();
		unos.close();
		File f = new File(imeFajla);

		if (f.exists()) {
			Scanner fs = new Scanner(f);
			System.out.println("Neparni brojevi iz fajla su: ");
			while (fs.hasNext()) {
				int broj = fs.nextInt();
				if (broj % 2 != 0) {
					System.out.print(broj + " ");
				}
			}
			fs.close();
		} else {
			System.out.println("Fajl sa tim imenom ne postoji.");
		}
	}
}
