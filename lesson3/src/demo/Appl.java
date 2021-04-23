package demo;

public class Appl {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        changeStr1(str1);
        System.out.println(str1);
        String str2 = new String("Hello");
        changeStr2(str2);
        System.out.println(str2);

        Integer intVal =Integer.valueOf(8);
        changeInt(intVal);
        System.out.println(intVal);
        Person person = new Person("John");
        changePerson(person);
        System.out.println(person.getName());


        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        Integer i = 132;
        Integer i2 = 132;
        System.out.println(i == i2);
        System.out.println(i.equals(i2));
    }

    public static void changeStr1(String str) {
        str.concat(" Guy.");
    }

    public static void changeStr2(String str) {
        str = str.concat(" Guy.");
    }

    public static void changeInt(Integer intVal) {
        intVal++;
    }

    public static void changePerson(Person person) {
        person = new Person("Peter");
    }

    static class Person {
        private String name;

        Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}

