package temp.palindrom;

public class Appl {

	public static void main(String[] args) {
		Palindrom palindrom = new PalindromImpl();
		String src = "words.txt";
		String dest = "palindromWords.txt";
		palindrom.filterPalindromWords(src, dest);
	}

}
