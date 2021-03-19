package lesson11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileByfferedCopy {

	public static void main(String[] args)  {
		try (BufferedReader fileIn = new BufferedReader(new FileReader("fileBufferedSymbol.txt"));
				BufferedWriter fileOut = new BufferedWriter(new FileWriter("copied_fileBufferedSymbol.txt"));) {

			int a;
			while ((a = fileIn.read()) != -1) {
				fileOut.write(a);

			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
