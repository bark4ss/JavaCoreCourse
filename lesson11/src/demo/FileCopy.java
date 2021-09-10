package demo;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopy {
	public static void main(String[] args) throws IOException {

		//getting current directory
		System.out.println("Working Directory = " + System.getProperty("user.dir"));

		//another way
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();

		System.out.println("Current relative path is: " + s);
		//try with resources
		try (FileInputStream fileIn = new FileInputStream("file.txt");
				FileOutputStream fileOut = new FileOutputStream("copied_file.txt", true)) {
					
			int a;
			while ((a = fileIn.read()) != -1) {
				System.out.println("ByteCode: " + a + " char presentation: " + (char)a);
				fileOut.write(a);
				
			}
		} 

	}

}
