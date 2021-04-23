package demo;

public class Appl {
    public static void main(String[] args) {
        Book book = new Book(125,"name");
        Object obj = new Object();
        String name = String.valueOf(book);
        String name2 = new String("Vasya");
        String name3 = "Nick";
        String name4 = "Nick";
        String name5 = new String("Nick");
        System.out.println(name3.equals(name4));
        System.out.println(name4.equals(name5));


        //System.out.println(name.concat(1 + " ++" + "gadg") + "next");
        System.out.println(name);
        System.out.println(book);
        String joiner = String.join(":", "Vasya", "Petya" , "Dima");
        System.out.println(joiner);
        int comparament = "VAttt".compareTo("VaTTT");
        System.out.println(comparament);
        System.out.println(joiner.charAt(5));
        System.out.println("bAttt".equalsIgnoreCase("VaTTT"));
        String temp = "Something wronggoes wrong";
        String matcher = "  well ";
        System.out.println(temp.indexOf(matcher));
        System.out.println(temp.startsWith(matcher));
        System.out.println(temp.replace("wrong",matcher));
        System.out.println(matcher.trim().length());
        System.out.println(matcher.strip().length());
        System.out.println(temp.substring(2,9));
        StringBuilder builder = new StringBuilder();
        builder.append(comparament);
        builder.append(matcher).append(temp);
        System.out.println(builder);
    }
}
