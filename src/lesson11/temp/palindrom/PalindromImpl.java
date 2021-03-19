package lesson11.temp.palindrom;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PalindromImpl implements Palindrom {

	@Override
	public void filterPalindromWords(String src, String dest) {
		try (BufferedReader reader = new BufferedReader(new FileReader(src));
				BufferedWriter writer = new BufferedWriter(new FileWriter(dest));) {

			String temp = "";
			while ((temp = reader.readLine()) != null) {
				StringBuilder builder = new StringBuilder(temp.toLowerCase());
				String def = builder.toString();
				String reverse = builder.reverse().toString();
				if (reverse.equals(def)) {
					writer.write(temp);
				}

			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
