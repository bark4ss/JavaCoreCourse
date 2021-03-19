package lesson11;

import java.io.File;

public class CreateDirectory {

	public static void main(String[] args) {
		String nameDir = "D://Newdir1/newdir";
		String pathDir = "D://TeachMeSkills/JavaCore";
		File a = new File(nameDir);
		File path = new File(pathDir);
		boolean flag = a.mkdir();
		System.out.println(flag);
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
