/*Napisati program koji kao argument prima ime filea te:
a. vraća broj karaktera u datom fileu
b. vraća broj riječi u datom fileu
c. vraća broj linija teksta u datom fileu
Riječi su razdvojene jednim spaceom.*/
package zadaciSaFajlovima;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) throws IOException {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite ime fajla: ");
		String imeFajla = unos.nextLine();
		Path path = Paths.get(imeFajla);
		File f = new File(imeFajla);
		int brojKaraktera = 0, brojRijeci = 0, brojLinija = 0;

		if (f.exists()) {
			BufferedReader br = Files.newBufferedReader(path);
			String linija = br.readLine();
			while (linija != null) {
				brojLinija++;
				String[] rijeci = linija.split(" ");
				brojRijeci += rijeci.length;

				for (String rijec : rijeci) {
					brojKaraktera += rijec.length();
				}
				linija = br.readLine();
			}
			System.out.println("Broj karaktera u fajlu je: " + brojKaraktera);
			System.out.println("Broj rijeci u fajlu je: " + brojRijeci);
			System.out.println("Broj linija teksta u fajlu je: " + brojLinija);
		} else {
			System.out.println("Fajl sa tim imenom ne postoji.");
		}

		unos.close();
	}

}
