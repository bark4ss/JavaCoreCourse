package demo;

public class Appl {
    public static void main(String[] args) {
        //https://topjava.ru/blog/rukovodstvo-po-string-pool-v-java
        //https://topjava.ru/blog/compact-strings-java-9
        Book book = new Book(125,"name");
        String lineTrim = "    \t Hello \n";
        System.out.println(lineTrim);
        System.out.println(lineTrim.strip());
        String name = String.valueOf(book);
        Object obj = new Object();
        System.out.println(name);
        String name2 = new String("Vasya").intern();
        String name3 = "Nick";
        name3 = "Den";
        String name4 = "Nick";
        String name5 = new String("Nick");
        System.out.println(name3.equals(name4));
        System.out.println(name4.equals(name5));


        System.out.println(name3.concat(" "  + name2) + " "  + name5);
        System.out.println(name);
        System.out.println(book);
        String joiner = String.join(" : ", "Vasya", "Petya" , "Dima");
        System.out.println(joiner);
        int comparament = "Va".compareTo("vA");
        System.out.println(comparament);
        System.out.println(joiner.charAt(5));
        System.out.println("bAttt".equalsIgnoreCase("VaTTT"));
        String temp = "Something wronggoes wrong";
        char[] result = new char[10];
        temp.getChars(0,9, result, 0);
        System.out.println(result);
        String matcher = "well, done";
        String [] r = matcher.split(", ");
        System.out.println(r[0]);
        String m = "e";
        boolean flag = matcher.regionMatches(1,m,0,1);
        System.out.println("Flag: " + flag);
        System.out.println(temp.indexOf(matcher));
        System.out.println(temp.startsWith(matcher));
        System.out.println(temp.replace("wrong",matcher));
        System.out.println(matcher.trim().length());
        System.out.println(matcher.strip().length());
        System.out.println(temp.substring(1,3));
        StringBuilder builder = new StringBuilder();
        builder.append(comparament);
        builder.append(matcher).append(temp).append("new");
        builder.insert(3, "T");
        builder.replace(3,4,"AAA");
        System.out.println(builder);
    }
}
