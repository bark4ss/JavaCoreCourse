package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileSymbolCopy {
	public static void main(String[] args) throws IOException {

		try (FileReader fileIn = new FileReader("fileSymbol.txt");
				FileWriter fileOut = new FileWriter("copied_fileSymbol.txt",true)) {

			int a;
			while ((a = fileIn.read()) != -1) {
				fileOut.write(a);

			}
			fileOut.write("Hello!!");
		}
	}

	public static void readFileWithoutTryWhithResources () throws IOException {

		FileReader fileIn = null;
		FileWriter fileOut = null;
		try {
			fileIn = new FileReader("fileSymbol.txt");
			fileOut = new FileWriter("copied_fileSymbol.txt");
			int a;
			while ((a = fileIn.read()) != -1) {
				fileOut.write(a);

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fileIn.close();
			fileOut.close();
		}
	}
}
