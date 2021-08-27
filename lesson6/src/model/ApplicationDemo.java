package model;

public class ApplicationDemo {
    public static void main(String[] args) {
        Book book = new Book(300, 1000, "Author1", "Book1");
        Journal journal = new Journal("Journal1", 500);
        PrintCenter center = new PrintCenter(journal);
        center.print();
    }
}
