package demo;

public class RegexDemo3 {
    public static void main(String[] args) {
        //https://metanit.com/java/tutorial/7.4.php
        String text = "FIFA will never regret it";
        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
        for(String word : words){
            System.out.println(word);
        }
    }
}
