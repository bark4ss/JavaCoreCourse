package demo;

import java.io.*;

public class FileByfferedCopy {

	public static void main(String[] args)  {
		File bufferDir = new File("buffer");
		boolean created = bufferDir.mkdirs();
		try (BufferedReader fileIn = new BufferedReader(new FileReader("fileBufferedSymbol.txt"));
				BufferedWriter fileOut = new BufferedWriter(new FileWriter("buffer/text22.txt"));) {

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
