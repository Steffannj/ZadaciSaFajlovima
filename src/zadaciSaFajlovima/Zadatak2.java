/*Napisati program koji pita korisnika da unese ime filea.
 *  Nakon što je korisnik unio ime filea, program vraća koliko se puta koje slovo ponovilo u fileu. 
 *  Program pravi razliku između velikih i malih slova – to jeste,
 *   vraća koliko puta se ponovilo slovo 'a' i koliko se puta ponovilo slovo 'A'.*/
package zadaciSaFajlovima;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Zadatak2 {
	public static void main(String[] args) throws IOException {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite ime fajla: ");
		String imeFajla = unos.nextLine();
		Path path = Paths.get(imeFajla);
		File f = new File(imeFajla);

		if (f.exists()) {
			BufferedReader br = Files.newBufferedReader(path);
			String text = "";
			String linija = br.readLine();

			while (linija != null) {
				text += linija;
				linija = br.readLine();
			}

			HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
			for (int i = 0; i < text.length(); i++) {
				if (hm.get(text.charAt(i)) != null) {
					int temp = hm.get(text.charAt(i));
					hm.put(text.charAt(i), ++temp);
				} else {
					hm.put(text.charAt(i), 1);
				}
			}
			System.out.println("Broj ponavljanja svih karaktera u fajlu: ");
			for (Entry<Character, Integer> entry : hm.entrySet()) {
				System.out.print(entry.getKey());
				System.out.print(":");
				System.out.print(entry.getValue());
				System.out.println();
			}
			unos.close();
		} else {
			System.out.println("Fajl sa tim imenom ne postoji.");
		}
	}
}
