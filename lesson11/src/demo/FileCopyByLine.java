package demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//https://metanit.com/java/tutorial/6.9.php
public class FileCopyByLine {

	public static void main(String[] args) {

		try (BufferedReader fileIn = new BufferedReader(new FileReader("fileBufferedSymbolByLine.txt"));
				BufferedWriter fileOut = new BufferedWriter(new FileWriter("copied_fileBufferedSymbolByLine.txt"))) {

			String line;
			int lengthBytes = 0;
			int countLine = 0;
			StringBuilder builder = new StringBuilder();
			while ((line = fileIn.readLine()) != null) {
				lengthBytes +=line.getBytes().length;
				System.out.println(line);
				builder.append(line).append("\n");
				countLine++;

			}
			System.out.println("Result length of bytes: " + lengthBytes);
			String result = builder.toString();
			String intermediateLine = result.stripTrailing();
			fileOut.write(intermediateLine);
			System.out.println("=================================");
			System.out.println("Total number of recorded lines: " + countLine);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
