/*Napisati program koji kao argument prima ime filea. Nakon što je korisnik unio ime filea, 
 * program prolazi kroz file te ispisuje rečenice iz filea po sljedećim pravilima:
a. Ukoliko je dužina rečenice manja od 55 karaktera, ispisati rečenicu bez ikakvih promjena.
b. Ukoliko je dužina rečenice veća od 55 karaktera, promijeniti rečenicu na sljedeći način:
i. Smanjiti dužinu rečenice na 40 karaktera
ii. Dodati string ... <Read More> na kraj rečenice
iii. Ispisati promjenjenu rečenicu na konzoli
PRIMJER:
text.txt:
Amy Lawrence was proud and glad, and she tried to make Tom see it in her face - but he wouldn't look.
Tom was tugging at a button-hole and looking sheepish.
konzola:
Amy Lawrence was proud and glad, and... <Read More>
Tom was tugging at a button-hole and looking sheepish.*/
package zadaciSaFajlovima;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak5 {
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
				if (linija.length() > 55) {
					for (int i = 0; i < 40; i++) {
						System.out.print(linija.charAt(i));
					}
					System.out.print("... <Read More>");
					System.out.println();
				} else {
					System.out.println(linija);
				}
			}
			reader.close();
		} else {
			System.out.println("Fajl sa tim imenom ne postoji.");
		}
	}
}
