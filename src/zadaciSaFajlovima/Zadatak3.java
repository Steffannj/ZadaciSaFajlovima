/*Napisati program koji pita korisnika da unese neki string. 
 * Kada korisnik unese string, program sprema isti string u 
 * file te ispisuje korisniku sve stringove iz filea naopako.*/
package zadaciSaFajlovima;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadatak3 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("fajlZaUpis.txt");
		BufferedReader br = Files.newBufferedReader(path);
		BufferedWriter bw = Files.newBufferedWriter(path);
		String linija = "";
		String text = "";
	
		System.out.println("Unesite string koji zelite upisati u fajl: ");
		Scanner unos = new Scanner(System.in);
		String upis = unos.nextLine();
		bw.write(text);
		bw.write(upis);
		bw.flush();
		unos.close();

		System.out.println("Ispis svih stringova iz fajla naopako: ");
		linija = br.readLine();
		while (linija != null) {
			String[] rijeci = linija.split(" ");
			for (String rijec : rijeci) {
				for (int i = rijec.length() - 1; i >= 0; i--) {
					System.out.print(rijec.charAt(i));
				}
				System.out.print(" ");
			}
			System.out.println();
			linija = br.readLine();
		}
	}
}
