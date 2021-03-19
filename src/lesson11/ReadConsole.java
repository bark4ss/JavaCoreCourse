package lesson11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsole {

	public static void main(String[] args) throws IOException {
		try(BufferedReader inStRe = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter writer = new BufferedWriter(new FileWriter("copied_fileBufferedConsoleSymbol.txt"))) {
			System.out.print("Input a symbol, symbol 'q' for quit: ");
			char a;
			while ((a = (char) inStRe.read()) != 'q') {
				writer.append(a);//Invoke 'write' method
				System.out.print(a);
			}
		}

	}

}
