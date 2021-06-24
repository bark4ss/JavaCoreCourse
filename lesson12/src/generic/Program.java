package generic;

public class Program {
    public static void main(String[] args) {
        AccountGeneric<Integer,String> account1 = new AccountGeneric<>(12,"6000");
        Integer acc1Id = account1.getId();
        String acc1Sum = account1.getSum();
        System.out.println(acc1Id);
        System.out.println(acc1Sum);

        AccountGeneric<Integer,String> account2 = new AccountGeneric<>(2345,"6000");
        Integer acc2Id = account2.getId();
        System.out.println(acc2Id);

        Printer printer = new Printer();
        String[] people = {"Tom", "Alice" , "Sam", "Kate" , "Bob" , "Helen"};
        Integer[] numbers = {23,4,5,2,12,465,4};

        printer.print(people);
        printer.print(numbers);

        Account accountOne = new Account(1,"1000");
        Account accountTwo = new Account(6,"1003");
        System.out.println(accountOne.equals(accountTwo));

    }
}
