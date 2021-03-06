package demo;

import java.io.File;

public class CreateDirectoryDemo1 {

	public static void main(String[] args) {
		String pathDir = "G://TeachMeSkills/TeachMeSkills/JavaCore";
		File path = new File(pathDir);
		int countFolder = 0;
		int countFile = 0;
		long totalSize = 0;
		for (String name : path.list()) {
			File file = new File(name);
			if(file.isDirectory()) {
				countFolder++;
			} else {
				countFile++;
				totalSize += file.length();
			}
			System.out.println(name);
		}
		System.out.println("Folders: " + countFolder);
		System.out.println("Files: " + countFile);
		System.out.println("Total size: " + totalSize);

	}

}
