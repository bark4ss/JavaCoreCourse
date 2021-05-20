package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileSymbolCopy {
	public static void main(String[] args) throws IOException {

		try (FileReader fileIn = new FileReader("fileSymbol.txt");
				FileWriter fileOut = new FileWriter("copied_fileSymbol.txt")) {

			int a;
			while ((a = fileIn.read()) != -1) {
				fileOut.write(a);

			}
		}
	}

	public static void readFileWithoutTryWhithResources () throws IOException {

		try (FileReader fileIn = new FileReader("fileSymbol.txt");
			 FileWriter fileOut = new FileWriter("copied_fileSymbol.txt")) {

			int a;
			while ((a = fileIn.read()) != -1) {
				fileOut.write(a);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
